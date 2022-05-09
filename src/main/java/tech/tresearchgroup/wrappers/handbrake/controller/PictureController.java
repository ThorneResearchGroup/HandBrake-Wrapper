package tech.tresearchgroup.wrappers.handbrake.controller;

import tech.tresearchgroup.wrappers.handbrake.model.PictureOptions;

import java.util.ArrayList;
import java.util.List;

public class PictureController {
    public static List<String> getOptions(PictureOptions pictureOptions) {
        List<String> optionsList = new ArrayList<>();
        if(pictureOptions.getWidth() != null) {
            optionsList.add("--width");
            optionsList.add(pictureOptions.getWidth());
        }
        if(pictureOptions.getHeight() != null) {
            optionsList.add("--height");
            optionsList.add(pictureOptions.getHeight());
        }
        if(pictureOptions.getCrop() != null) {
            optionsList.add("--crop");
            optionsList.add(pictureOptions.getCrop());
        }
        if(pictureOptions.getLooseCrop() != null) {
            optionsList.add("--loose-crop");
            optionsList.add(pictureOptions.getCrop());
        }
        if(pictureOptions.getMaxHeight() != null) {
            optionsList.add("--maxHeight");
            optionsList.add(pictureOptions.getMaxHeight());
        }
        if(pictureOptions.getMaxWidth() != null) {
            optionsList.add("--maxWidth");
            optionsList.add(pictureOptions.getMaxWidth());
        }
        if(pictureOptions.isNonAnamorphic()) {
            optionsList.add("--non-anamorphic");
        }
        if(pictureOptions.isLooseAnamorphic()) {
            optionsList.add("--loose-anamorphic");
        }
        if(pictureOptions.isCustomAnamorphic()) {
            optionsList.add("--custom-anamorphic");
        }
        if(pictureOptions.getDisplayWidth() != null) {
            optionsList.add("--display-width");
            optionsList.add(pictureOptions.getDisplayWidth());
        }
        if(pictureOptions.isKeepDisplayAspect()) {
            optionsList.add("--keep-display-aspect");
        }
        if(pictureOptions.getPixelAspect() != null) {
            optionsList.add("--pixel-aspect");
            optionsList.add(pictureOptions.getPixelAspect());
        }
        if(pictureOptions.isItuPar()) {
            optionsList.add("--itu-par");
        }
        if(pictureOptions.getModulus() != null) {
            optionsList.add("--modulus");
            optionsList.add(pictureOptions.getModulus());
        }
        if(pictureOptions.getColorMatrix() != null) {
            optionsList.add("--color-matrix");
            optionsList.add(pictureOptions.getColorMatrix());
        }
        return optionsList;
    }
}
