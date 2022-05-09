package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.GeneralOptions;

import java.util.ArrayList;
import java.util.List;

public class GeneralController {
    public static List<String> getOptions(GeneralOptions generalOptions) {
        List<String> optionsList = new ArrayList<>();
        if(generalOptions.isHelp()) {
            optionsList.add("--help");
        }
        if(generalOptions.isVersion()) {
            optionsList.add("--version");
        }
        if(generalOptions.isJson()) {
            optionsList.add("--json");
        }
        if(generalOptions.getVerbose() != null) {
            optionsList.add("--verbose");
            optionsList.add(generalOptions.getVerbose());
        }
        if(generalOptions.getPreset() != null) {
            optionsList.add("--preset");
            optionsList.add(generalOptions.getPreset());
        }
        if(generalOptions.isPresetList()) {
            optionsList.add("--preset-list");
        }
        if(generalOptions.getPresetImportFile() != null) {
            optionsList.add("--preset-import-file");
        }
        if(generalOptions.isPresetImportGui()) {
            optionsList.add("--preset-import-gui");
        }
        if(generalOptions.getPresetExport() != null) {
            optionsList.add("--preset-export");
            optionsList.add(generalOptions.getPresetExport());
        }
        if(generalOptions.getPresetExportFile() != null) {
            optionsList.add("--preset-export-file");
            optionsList.add(generalOptions.getPresetExportFile());
        }
        if(generalOptions.getPresetExportDescription() != null) {
            optionsList.add("--preset-export-description");
            optionsList.add(generalOptions.getPresetExportDescription());
        }
        if(generalOptions.getQueueImportFile() != null) {
            optionsList.add("--preset-import-file");
            optionsList.add(generalOptions.getQueueImportFile());
        }
        if(generalOptions.getNoDvdnav() != null) {
            optionsList.add("--no-dvdnav");
            optionsList.add(generalOptions.getNoDvdnav());
        }
        return optionsList;
    }
}
