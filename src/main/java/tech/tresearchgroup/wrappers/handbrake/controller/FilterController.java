package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.FilterOptions;

import java.util.ArrayList;
import java.util.List;

public class FilterController {
    public static List<String> getOptions(FilterOptions filterOptions) {
        List<String> optionsList = new ArrayList<>();
        if(filterOptions.getCombDetect() != null) {
            optionsList.add("--comb-detect");
            optionsList.add(filterOptions.getCombDetect());
        }
        if(filterOptions.getDeinterlace() != null) {
            optionsList.add("--deinterlace");
            optionsList.add(filterOptions.getDeinterlace());
        }
        if(filterOptions.getDecomb() != null) {
            optionsList.add("--decomb");
            optionsList.add(filterOptions.getDecomb());
        }
        if(filterOptions.getDetelecine() != null) {
            optionsList.add("--detelecine");
            optionsList.add(filterOptions.getDetelecine());
        }
        if(filterOptions.getHqdn3d() != null) {
            optionsList.add("--hqdn3d");
            optionsList.add(filterOptions.getHqdn3d());
        }
        if(filterOptions.getNlmeans() != null) {
            optionsList.add("--nlmeans");
            optionsList.add(filterOptions.getNlmeans());
        }
        if(filterOptions.getNlmeansTune() != null) {
            optionsList.add("--nlmeans-tune");
            optionsList.add(filterOptions.getNlmeansTune());
        }
        if(filterOptions.getChromaSmoothTune() != null) {
            optionsList.add("--chroma-smooth-tune");
            optionsList.add(filterOptions.getChromaSmoothTune());
        }
        if(filterOptions.getUnsharp() != null) {
            optionsList.add("--unsharp");
            optionsList.add(filterOptions.getUnsharp());
        }
        if(filterOptions.getUnsharpTune() != null) {
            optionsList.add("--unsharp-tune");
            optionsList.add(filterOptions.getUnsharpTune());
        }
        if(filterOptions.getLapsharp() != null) {
            optionsList.add("--lapsharp");
            optionsList.add(filterOptions.getLapsharp());
        }
        if(filterOptions.getLapsharpTune() != null) {
            optionsList.add("--lapsharp-tune");
            optionsList.add(filterOptions.getLapsharpTune());
        }
        if(filterOptions.getDeblock() != null) {
            optionsList.add("--deblock");
            optionsList.add(filterOptions.getDeblock());
        }
        if(filterOptions.getDeblockTune() != null) {
            optionsList.add("--deblock-tune");
            optionsList.add(filterOptions.getDeblockTune());
        }
        if(filterOptions.getRotate() != null) {
            optionsList.add("--rotate");
            optionsList.add(filterOptions.getRotate());
        }
        if(filterOptions.getPad() != null) {
            optionsList.add("--pad");
            optionsList.add(filterOptions.getPad());
        }
        if(filterOptions.getColorspace() != null) {
            optionsList.add("--colorspace");
            optionsList.add(filterOptions.getColorspace());
        }
        if(filterOptions.isGrayscale()) {
            optionsList.add("--grayscale");
        }
        return optionsList;
    }
}
