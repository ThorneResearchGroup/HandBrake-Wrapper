package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class PictureOptions {
    @CommandLine.Option(names = "--width", description = "Set storage width in pixels")
    private String width;

    @CommandLine.Option(names = "--height", description = "Set storage height in pixels")
    private String height;

    @CommandLine.Option(names = "--crop", description = "<top:bottom:left:right> Set picture cropping in pixels (default: automatically remove black bars)")
    private String crop;

    @CommandLine.Option(names = "--loose-crop", description = "Always crop to a multiple of the modulus")
    private String looseCrop;

    @CommandLine.Option(names = "--maxHeight", description = "Set maximum height in pixels")
    private String maxHeight;

    @CommandLine.Option(names = "--maxWidth", description = "Set maximum width in pixels")
    private String maxWidth;

    @CommandLine.Option(names = "--non-anamorphic", description = "Set pixel aspect ratio to 1:1")
    private boolean nonAnamorphic;

    @CommandLine.Option(names = "--loose-anamorphic", description = "Store pixel aspect ratio that maximizes storage resolution")
    private boolean looseAnamorphic;

    @CommandLine.Option(names = "--custom-anamorphic", description = "Store pixel aspect ratio in video stream and directly control all parameters.")
    private boolean customAnamorphic;

    @CommandLine.Option(names = "--display-width", description = "Set display width in pixels, for custom anamorphic. This determines the display aspect during playback, which may differ from the storage aspect.")
    private String displayWidth;

    @CommandLine.Option(names = "--keep-display-aspect", description = "Preserve the source's display aspect ratio when using custom anamorphic")
    private boolean keepDisplayAspect;

    @CommandLine.Option(names = "--pixel-aspect", description = "Set pixel aspect for custom anamorphic (--display-width and --pixel-aspect are mutually exclusive.")
    private String pixelAspect;

    @CommandLine.Option(names = "--itu-par", description = "Use wider ITU pixel aspect values for loose and custom anamorphic, useful with underscanned sources")
    private boolean ituPar;

    @CommandLine.Option(names = "--modulus", description = "Set storage width and height modulus. Dimensions will be made divisible by this number. (default: set by preset, typically 2)")
    private String modulus;

    @CommandLine.Option(names = "--color-matrix", description = "Set the color space signaled by the output: Overrides color signalling with no conversion. 2020, 709, 601, ntsc (same as 601) pal (default: auto-detected from source)")
    private String colorMatrix;
}
