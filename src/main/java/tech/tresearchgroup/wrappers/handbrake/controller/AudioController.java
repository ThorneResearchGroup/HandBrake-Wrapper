package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.AudioOptions;

import java.util.ArrayList;
import java.util.List;

public class AudioController {
    public static List<String> getOptions(AudioOptions audioOptions) {
        List<String> optionsList = new ArrayList<>();
        if(audioOptions.getAudioLangList() != null) {
            optionsList.add("--audio-lang-list");
            optionsList.add(audioOptions.getAudioLangList());
        }
        if(audioOptions.isAllAudio()) {
            optionsList.add("--all-audio");
        }
        if(audioOptions.isFirstAudio()) {
            optionsList.add("--first-audio");
        }
        if(audioOptions.getAudio() != null) {
            optionsList.add("--audio");
            optionsList.add(audioOptions.getAudio());
        }
        if(audioOptions.getAEncoder() != null) {
            optionsList.add("--aencoder");
            optionsList.add(audioOptions.getAEncoder());
        }
        if(audioOptions.getAudioCopyMask() != null) {
            optionsList.add("--audio-copy-mask");
            optionsList.add(audioOptions.getAudioCopyMask());
        }
        if(audioOptions.getAudioFallback() != null) {
            optionsList.add("--audio-fallback");
            optionsList.add(audioOptions.getAudioFallback());
        }
        if(audioOptions.getAb() != null) {
            optionsList.add("--ab");
            optionsList.add(audioOptions.getAb());
        }
        if(audioOptions.isAq()) {
            optionsList.add("--aq");
        }
        if(audioOptions.isAc()) {
            optionsList.add("--ac");
        }
        if(audioOptions.getMixdown() != null) {
            optionsList.add("--mixdown");
            optionsList.add(audioOptions.getMixdown());
        }
        if(audioOptions.getNormalizeMix() != null) {
            optionsList.add("--normalize-mix");
            optionsList.add(audioOptions.getNormalizeMix());
        }
        if(audioOptions.getArate() != null) {
            optionsList.add("--arate");
            optionsList.add(audioOptions.getArate());
        }
        if(audioOptions.getDrc() != null) {
            optionsList.add("--drc");
            optionsList.add(audioOptions.getDrc());
        }
        if(audioOptions.getGain() != null) {
            optionsList.add("--gain");
            optionsList.add(audioOptions.getGain());
        }
        if(audioOptions.getAdither() != null) {
            optionsList.add("--adither");
            optionsList.add(audioOptions.getAdither());
        }
        if(audioOptions.getAname() != null) {
            optionsList.add("--aname");
            optionsList.add(audioOptions.getAname());
        }
        return optionsList;
    }
}
