package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.VideoOptions;

import java.util.ArrayList;
import java.util.List;

public class VideoController {
    public static List<String> getOptions(VideoOptions videoOptions) {
        List<String> optionsList = new ArrayList<>();
        if(videoOptions.getEncoder() != null) {
            optionsList.add("--encoder");
            optionsList.add(videoOptions.getEncoder());
        }
        if(videoOptions.getEncoderPreset() != null) {
            optionsList.add("--encoder-preset");
            optionsList.add(videoOptions.getEncoderPreset());
        }
        if(videoOptions.getEncoderPresetList() != null) {
            optionsList.add("--encoder-preset-list");
            optionsList.add(videoOptions.getEncoderPresetList());
        }
        if(videoOptions.getEncoderTune() != null) {
            optionsList.add("--encoder-tune");
            optionsList.add(videoOptions.getEncoderTune());
        }
        if(videoOptions.getEncoderTuneList() != null) {
            optionsList.add("--encoder-tune-list");
            optionsList.add(videoOptions.getEncoderTuneList());
        }
        if(videoOptions.getEncOpts() != null) {
            optionsList.add("--encopts");
            optionsList.add(videoOptions.getEncOpts());
        }
        if(videoOptions.getEncoderProfile() != null) {
            optionsList.add("--encoder-profile");
            optionsList.add(videoOptions.getEncoderProfile());
        }
        if(videoOptions.getEncoderProfileList() != null) {
            optionsList.add("--encoder-profile-list");
            optionsList.add(videoOptions.getEncoderProfileList());
        }
        if(videoOptions.getEncoderLevel() != null) {
            optionsList.add("--encoder-level");
            optionsList.add(videoOptions.getEncoderLevel());
        }
        if(videoOptions.getEncoderLevelList() != null) {
            optionsList.add("--encoder-level-list");
            optionsList.add(videoOptions.getEncoderLevelList());
        }
        if(videoOptions.getQuality() != null) {
            optionsList.add("--quality");
            optionsList.add(videoOptions.getQuality());
        }
        if(videoOptions.getVb() != null) {
            optionsList.add("--vb");
            optionsList.add(videoOptions.getVb());
        }
        if(videoOptions.isTwoPass()) {
            optionsList.add("--two-pass");
        }
        if(videoOptions.isTurbo()) {
            optionsList.add("--turbo");
        }
        if(videoOptions.getRate() != null) {
            optionsList.add("--rate");
            optionsList.add(videoOptions.getRate());
        }
        if(videoOptions.getVfr() != null) {
            optionsList.add("--vfr");
            optionsList.add(videoOptions.getVfr());
        }
        if(videoOptions.getCfr() != null) {
            optionsList.add("--cfr");
            optionsList.add(videoOptions.getCfr());
        }
        if(videoOptions.getPfr() != null) {
            optionsList.add("--pfr");
            optionsList.add(videoOptions.getPfr());
        }
        return optionsList;
    }
}
