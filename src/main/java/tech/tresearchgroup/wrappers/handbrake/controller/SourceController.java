package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.SourceOptions;

import java.util.ArrayList;
import java.util.List;

public class SourceController {
    public static List<String> getOptions(SourceOptions sourceOptions) {
        List<String> optionsList = new ArrayList<>();
        if(sourceOptions.getInput() != null) {
            optionsList.add("--input");
            optionsList.add(sourceOptions.getInput());
        }
        if(sourceOptions.getTitle() != null) {
            optionsList.add("--title");
            optionsList.add(sourceOptions.getTitle());
        }
        if(sourceOptions.getMinDuration() != null) {
            optionsList.add("--min-duration");
            optionsList.add(sourceOptions.getMinDuration());
        }
        if(sourceOptions.isScan()) {
            optionsList.add("--scan");
        }
        if(sourceOptions.isMainFeature()) {
            optionsList.add("--main-feature");
        }
        if(sourceOptions.getChapters() != null) {
            optionsList.add("--chapters");
            optionsList.add(sourceOptions.getChapters());
        }
        if(sourceOptions.getAngle() != null) {
            optionsList.add("--angle");
            optionsList.add(sourceOptions.getAngle());
        }
        if(sourceOptions.getPreviews() != null) {
            optionsList.add("--previews");
            optionsList.add(sourceOptions.getPreviews());
        }
        if(sourceOptions.getStartAtPreview() != null) {
            optionsList.add("--start-at-preview");
            optionsList.add(sourceOptions.getStartAtPreview());
        }
        if(sourceOptions.getStartAt() != null) {
            optionsList.add("--start-at");
            optionsList.add(sourceOptions.getStartAt());
        }
        if(sourceOptions.getStopAt() != null) {
            optionsList.add("--stop-at");
            optionsList.add(sourceOptions.getStopAt());
        }
        return optionsList;
    }
}
