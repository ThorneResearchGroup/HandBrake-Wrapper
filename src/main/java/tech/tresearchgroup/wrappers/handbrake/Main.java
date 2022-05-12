package tech.tresearchgroup.wrappers.handbrake;

import picocli.CommandLine;
import tech.tresearchgroup.wrappers.handbrake.controller.*;
import tech.tresearchgroup.wrappers.handbrake.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "HandBrakeCLI", mixinStandardHelpOptions = true,
        description = "TRG FPCalc wrapper")
public class Main implements Callable<Integer> {
    @CommandLine.ArgGroup
    private AudioOptions audioOptions;

    @CommandLine.ArgGroup
    private DestinationOptions destinationOptions;

    @CommandLine.ArgGroup
    private FilterOptions filterOptions;

    @CommandLine.ArgGroup
    private GeneralOptions generalOptions;

    @CommandLine.ArgGroup
    private PictureOptions pictureOptions;

    @CommandLine.ArgGroup
    private SourceOptions sourceOptions;

    @CommandLine.ArgGroup
    private SubtitleOptions subtitleOptions;

    @CommandLine.ArgGroup
    private VideoOptions videoOptions;

    @Override
    public Integer call() {
        List<String> options = new ArrayList<>();
        options.add("HandBrakeCLI");
        if(audioOptions != null) {
            options.addAll(AudioController.getOptions(audioOptions));
        }
        if(destinationOptions != null) {
            options.addAll(DestinationController.getOptions(destinationOptions));
        }
        if(filterOptions != null) {
            options.addAll(FilterController.getOptions(filterOptions));
        }
        if(generalOptions != null) {
            options.addAll(GeneralController.getOptions(generalOptions));
        }
        if(pictureOptions != null) {
            options.addAll(PictureController.getOptions(pictureOptions));
        }
        if(sourceOptions != null) {
            options.addAll(SourceController.getOptions(sourceOptions));
        }
        if(subtitleOptions != null) {
            options.addAll(SubtitleController.getOptions(subtitleOptions));
        }
        if(videoOptions != null) {
            options.addAll(VideoController.getOptions(videoOptions));
        }
        return execute(options);
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    public static int execute(List<String> options) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(options);
        System.out.println(options);
        try {
            Process process = processBuilder.start();
            String line;
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
             */
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }
            errorReader.close();
            return process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
