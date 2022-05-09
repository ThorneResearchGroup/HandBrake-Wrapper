package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.DestinationOptions;

import java.util.ArrayList;
import java.util.List;

public class DestinationController {
    public static List<String> getOptions(DestinationOptions destinationOptions) {
        List<String> optionsList = new ArrayList<>();
        if(destinationOptions.getOutput() != null) {
            optionsList.add("--output");
            optionsList.add(destinationOptions.getOutput());
        }
        if(destinationOptions.getFormat() != null) {
            optionsList.add("--format");
            optionsList.add(destinationOptions.getFormat());
        }
        if(destinationOptions.isMarkers()) {
            optionsList.add("--markers");
        }
        if(destinationOptions.isOptimize()) {
            optionsList.add("--optimize");
        }
        if(destinationOptions.isIpodAtom()) {
            optionsList.add("--ipod-atom");
        }
        if(destinationOptions.isAlignAv()) {
            optionsList.add("--align-av");
        }
        if(destinationOptions.isInlineParameterSets()) {
            optionsList.add("--inline-parameter-sets");
        }
        return optionsList;
    }
}
