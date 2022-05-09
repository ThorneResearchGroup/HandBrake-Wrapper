package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AudioOptions {
    @CommandLine.Option(names = "--audio-lang-list", description = "Specify a comma separated list of audio languages you would like to select from the source title. By default, the first audio matching each language will be added to your output. Provide the language's ISO 639-2 code (e.g. fre, eng, spa, dut, et cetera) Use code 'und' (Unknown) to match all languages.")
    private String audioLangList;

    @CommandLine.Option(names = "--all-audio", description = "Select all audio tracks matching languages in the specified language list (--audio-lang-list). Any language if list is not specified.")
    private boolean allAudio;

    @CommandLine.Option(names = "--first-audio", description = "Select first audio track matching languages in the specified language list (--audio-lang-list). Any language if list is not specified.")
    private boolean firstAudio;

    @CommandLine.Option(names = "--audio", description = "Select audio track(s), separated by commas ('none' for no audio, '1,2,3' for multiple tracks, default: first one). Multiple output tracks can be used for one input.")
    private String audio;

    @CommandLine.Option(names = "--aencoder", description = "Select audio encoder(s): none, av_aac, copy:aac, ac3, copy:ac3, eac3, copy:eac3, copy:truehd, copy:dts, copy:dtshd, copy:mp2, mp3, copy:mp3, vorbis, flac16, flac24, copy:flac, opus, copy 'copy:<type>' will pass through the corresponding audio track without modification, if pass through is supported for the audio type. Separate tracks by commas. Defaults: av_mp4   av_aac, av_mkv   mp3, av_webm  vorbis")
    private String aEncoder;

    @CommandLine.Option(names = "--audio-copy-mask", description = "Set audio codecs that are permitted when the 'copy' audio encoder option is specified (aac/ac3/eac3/truehd/dts/dtshd/mp2/mp3/flac). Separated by commas for multiple allowed options.")
    private String audioCopyMask;

    @CommandLine.Option(names = "--audio-fallback", description = "Set audio codec to use when it is not possible to copy an audio track without re-encoding.")
    private String audioFallback;

    @CommandLine.Option(names = "--ab", description = "Set audio track bitrate(s) in kbit/s. (default: determined by the selected codec, mixdown, and samplerate combination). Separate tracks by commas.")
    private String ab;

    @CommandLine.Option(names = "--aq", description = "Set audio quality metric. Separate tracks by commas.")
    private boolean aq;

    @CommandLine.Option(names = "--ac", description = "Set audio compression metric. (available depending on selected codec). Separate tracks by commas.")
    private boolean ac;

    @CommandLine.Option(names = "--mixdown", description = "Format(s) for audio downmixing/upmixing: mono, left_only, right_only, stereo, dpl1, dpl2, 5point1, 6point1, 7point1, 5_2_lfe. Separate tracks by commas. Defaults: none             up to dpl2, av_aac           up to 7point1, ac3              up to 5point1, eac3             up to 5point1, mp3              up to dpl2, vorbis           up to dpl2, flac16           up to 7point1, flac24           up to 7point1, opus             up to 7point1")
    private String mixdown;

    @CommandLine.Option(names = "--normalize-mix", description = "Normalize audio mix levels to prevent clipping. Separate tracks by commas. 0 = Disable Normalization (default), 1 = Enable Normalization")
    private String normalizeMix;

    @CommandLine.Option(names = "--arate", description = "Set audio samplerate(s) (8/11.025/12/16/22.05/24/32/44.1/48 kHz) or 'auto'. Separate tracks by commas.")
    private String arate;

    @CommandLine.Option(names = "--drc", description = "Apply extra dynamic range compression to the audio, making soft sounds louder. Range is 1.0 to 4.0 (too loud), with 1.5 - 2.5 being a useful range. Separate tracks by commas.")
    private String drc;

    @CommandLine.Option(names = "--gain", description = "Amplify or attenuate audio before encoding.  Does NOT work with audio passthru (copy). Values are in dB.  Negative values attenuate, positive values amplify. A 1 dB difference is barely audible.")
    private String gain;

    @CommandLine.Option(names = "--adither", description = "Select dithering to apply before encoding audio: auto (default), none, rectangular, triangular, triangular_hp, lipshitz_ns. Separate tracks by commas. Supported by encoder(s): flac16")
    private String adither;

    @CommandLine.Option(names = "--aname", description = "Set audio track name(s). Separate tracks by commas.")
    private String aname;
}
