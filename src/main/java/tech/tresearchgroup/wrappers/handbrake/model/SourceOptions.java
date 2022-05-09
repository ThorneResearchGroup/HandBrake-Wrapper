package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class SourceOptions {
    @CommandLine.Option(names = "--input", description = "Set input file or device")
    private String input;

    @CommandLine.Option(names = "--title", description = "Select a title to encode (0 to scan all titles only, default: 1)")
    private String title;

    @CommandLine.Option(names = "--min-duration", description = "Set the minimum title duration (in seconds). Shorter titles will be ignored (default: 10).")
    private String minDuration;

    @CommandLine.Option(names = "--scan", description = "Scan selected title only")
    private boolean scan;

    @CommandLine.Option(names = "--main-feature", description = "Detect and select the main feature title.")
    private boolean mainFeature;

    @CommandLine.Option(names = "--chapters", description = "Select chapters (e.g. '1-3' for chapters 1 to 3 or '3' for chapter 3 only, default: all chapters)")
    private String chapters;

    @CommandLine.Option(names = "--angle", description = "Select the video angle (DVD or Blu-ray only)")
    private String angle;

    @CommandLine.Option(names = "--previews", description = "Select how many preview images are generated, and whether to store to disk (0 or 1). (default: 10:0)")
    private String previews;

    @CommandLine.Option(names = "--start-at-preview", description = "Start encoding at a given preview.")
    private String startAtPreview;

    @CommandLine.Option(names = "--start-at", description = "Start encoding at a given offset in seconds, frames, or pts (on a 90kHz clock) (e.g. seconds:10, frames:300, pts:900000). Units must match --stop-at units, if specified.")
    private String startAt;

    @CommandLine.Option(names = "--stop-at", description = "Stop encoding after a given duration in seconds, frames, or pts (on a 90kHz clock) has passed (e.g. seconds:10, frames:300, pts:900000). Duration is relative to --start-at, if specified. Units must match --start-at units, if specified.")
    private String stopAt;
}
