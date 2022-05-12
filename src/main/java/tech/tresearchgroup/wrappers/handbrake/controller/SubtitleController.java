package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.SubtitleOptions;

import java.util.ArrayList;
import java.util.List;

public class SubtitleController {
    public static List<String> getOptions(SubtitleOptions subtitleOptions) {
        List<String> optionsList = new ArrayList<>();
        if(subtitleOptions.getSubtitleLangList() != null) {
            optionsList.add("--subtitle-lang-list");
            optionsList.add(subtitleOptions.getSubtitleLangList());
        }
        if(subtitleOptions.isAllSubtitles()) {
            optionsList.add("--all-subtitles");
        }
        if(subtitleOptions.isFirstSubtitle()) {
            optionsList.add("--first-subtitle");
        }
        if(subtitleOptions.getSubtitle() != null) {
            optionsList.add("--subtitle");
            optionsList.add(subtitleOptions.getSubtitle());
        }
        if(subtitleOptions.getSubname() != null) {
            optionsList.add("--subname");
            optionsList.add(subtitleOptions.getSubname());
        }
        if(subtitleOptions.getSubtitleForced() != null) {
            optionsList.add("--subtitle-forced");
            optionsList.add(subtitleOptions.getSubtitleForced());
        }
        if(subtitleOptions.getSubtitleDefault() != null) {
            optionsList.add("--subtitle-default");
            optionsList.add(subtitleOptions.getSubtitleDefault());
        }
        if(subtitleOptions.getNativeLanguage() != null) {
            optionsList.add("--native-language");
            optionsList.add(subtitleOptions.getNativeLanguage());
        }
        if(subtitleOptions.getNativeDub() != null) {
            optionsList.add("--native-dub");
            optionsList.add(subtitleOptions.getNativeDub());
        }
        if(subtitleOptions.getSrtFile() != null) {
            optionsList.add("--srt-file");
            optionsList.add(subtitleOptions.getSrtFile());
        }
        if(subtitleOptions.getSrtCodeset() != null) {
            optionsList.add("--srt-codeset");
            optionsList.add(subtitleOptions.getSrtCodeset());
        }
        if(subtitleOptions.getSrtOffset() != null) {
            optionsList.add("--srt-offset");
            optionsList.add(subtitleOptions.getSrtOffset());
        }
        if(subtitleOptions.getSrtLang() != null) {
            optionsList.add("--srt-lang");
            optionsList.add(subtitleOptions.getSrtLang());
        }
        if(subtitleOptions.getSrtDefault() != null) {
            optionsList.add("--srt-default");
            optionsList.add(subtitleOptions.getSrtDefault());
        }
        if(subtitleOptions.getSrtBurn() != null) {
            optionsList.add("--srt-burn");
            optionsList.add(subtitleOptions.getSrtBurn());
        }
        if(subtitleOptions.getSsaFile() != null) {
            optionsList.add("--ssa-file");
            optionsList.add(subtitleOptions.getSsaFile());
        }
        if(subtitleOptions.getSsaOffset() != null) {
            optionsList.add("--ssa-offset");
            optionsList.add(subtitleOptions.getSsaOffset());
        }
        if(subtitleOptions.getSsaLang() != null) {
            optionsList.add("--ssa-lang");
            optionsList.add(subtitleOptions.getSsaLang());
        }
        if(subtitleOptions.getSsaDefault() != null) {
            optionsList.add("--ssa-default");
            optionsList.add(subtitleOptions.getSsaDefault());
        }
        if(subtitleOptions.getSsaBurn() != null) {
            optionsList.add("--ssa-burn");
            optionsList.add(subtitleOptions.getSsaBurn());
        }
        return optionsList;
    }
}
