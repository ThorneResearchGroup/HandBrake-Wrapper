package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class DestinationOptions {
    @CommandLine.Option(names = "--output", description = "Set destination file name")
    private String output;

    @CommandLine.Option(names = "--format", description = "Select container format: av_mp4, av_mkv, av_webm default: auto-detected from destination file name)")
    private String format;

    @CommandLine.Option(names = "--markers", description = "Add chapter markers")
    private boolean markers;

    @CommandLine.Option(names = "--optimize", description = "Optimize MP4 files for HTTP streaming (fast start, s.s. rewrite file to place MOOV atom at beginning)")
    private boolean optimize;

    @CommandLine.Option(names = "--ipod-atom", description = "Add iPod 5G compatibility atom to MP4 container")
    private boolean ipodAtom;

    @CommandLine.Option(names = "--align-av", description = "Add audio silence or black video frames to start of streams so that all streams start at exactly the same time")
    private boolean alignAv;

    @CommandLine.Option(names = "--inline-parameter-sets", description = "Create adaptive streaming compatible output. Inserts parameter sets (SPS and PPS) inline in the video stream before each IDR.")
    private boolean inlineParameterSets;
}
