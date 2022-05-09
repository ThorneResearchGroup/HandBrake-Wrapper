package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class VideoOptions {
    @CommandLine.Option(names = "--encoder", description = "Select video encoder: x264, x264_10bit, x265, x265_10bit, x265_12bit, mpeg4, mpeg2, VP8, VP9, theora")
    private String encoder;

    @CommandLine.Option(names = "--encoder-preset", description = "Adjust video encoding settings for a particular speed/efficiency tradeoff (encoder-specific)")
    private String encoderPreset;

    @CommandLine.Option(names = "--encoder-preset-list", description = "List supported --encoder-preset values for the specified video encoder")
    private String encoderPresetList;

    @CommandLine.Option(names = "--encoder-tune", description = "Adjust video encoding settings for a particular type of source or situation (encoder-specific)")
    private String encoderTune;

    @CommandLine.Option(names = "--encoder-tune-list", description = "List supported --encoder-tune values for the specified video encoder")
    private String encoderTuneList;

    @CommandLine.Option(names = "--encopts", description = "Specify advanced encoding options in the same style as mencoder (all encoders except theora): option1=value1:option2=value2")
    private String encOpts;

    @CommandLine.Option(names = "--encoder-profile", description = "Ensure compliance with the requested codec profile (encoder-specific)")
    private String encoderProfile;

    @CommandLine.Option(names = "--encoder-profile-list", description = "List supported --encoder-profile values for the specified video encoder")
    private String encoderProfileList;

    @CommandLine.Option(names = "--encoder-level", description = "Ensures compliance with the requested codec level (encoder-specific)")
    private String encoderLevel;

    @CommandLine.Option(names = "--encoder-level-list", description = "List supported --encoder-level values for the specified video encoder")
    private String encoderLevelList;

    @CommandLine.Option(names = "--quality", description = "Set video quality (e.g. 22.0)")
    private String quality;

    @CommandLine.Option(names = "--vb", description = "Set video bitrate in kbit/s (default: 1000)")
    private String vb;

    @CommandLine.Option(names = "--two-pass", description = "Use two-pass mode")
    private boolean twoPass;

    @CommandLine.Option(names = "--turbo", description = "When using 2-pass use 'turbo' options on the first pass to improve speed (works with x264 and x265)")
    private boolean turbo;

    @CommandLine.Option(names = "--rate", description = "Set video framerate (5/10/12/15/20/23.976/24/25/29.97/30/48/50/59.94/60/72/75/90/100/120 or a number between 1 and 1000). Be aware that not specifying a framerate lets HandBrake preserve a source's time stamps, potentially creating variable framerate video")
    private String rate;

    @CommandLine.Option(names = "--vrf")
    private String vfr;

    @CommandLine.Option(names = "--cfr")
    private String cfr;

    @CommandLine.Option(names = "--pfr")
    private String pfr;
}
