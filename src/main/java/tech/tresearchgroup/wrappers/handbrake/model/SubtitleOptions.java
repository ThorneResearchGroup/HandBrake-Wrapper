package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class SubtitleOptions {
    @CommandLine.Option(names = "--subtitle-lang-list", description = "Specify a comma separated list of subtitle\n" +
            "                           languages you would like to select from the\n" +
            "                           source title. By default, the first subtitle\n" +
            "                           matching each language will be added to your\n" +
            "                           output. Provide the language's ISO 639-2 code\n" +
            "                           (e.g. fre, eng, spa, dut, et cetera)")
    private String subtitleLangList;

    @CommandLine.Option(names = "--all-subtitles", description = "Select all subtitle tracks matching languages in\n" +
            "                           the specified language list\n" +
            "                           (--subtitle-lang-list).\n" +
            "                           Any language if list is not specified.")
    private boolean allSubtitles;

    @CommandLine.Option(names = "--first-subtitle", description = "Select first subtitle track matching languages in\n" +
            "                           the specified language list\n" +
            "                           (--subtitle-lang-list).\n" +
            "                           Any language if list is not specified.")
    private boolean firstSubtitle;

    @CommandLine.Option(names = "--subtitle", description = "Select subtitle track(s), separated by commas\n" +
            "                           More than one output track can be used for one\n" +
            "                           input. \"none\" for no subtitles.\n" +
            "                           Example: \"1,2,3\" for multiple tracks.\n" +
            "                           A special track name \"scan\" adds an extra first\n" +
            "                           pass. This extra pass scans subtitles matching\n" +
            "                           the language of the first audio or the language \n" +
            "                           selected by --native-language.\n" +
            "                           The one that's only used 10 percent of the time\n" +
            "                           or less is selected. This should locate subtitles\n" +
            "                           for short foreign language segments. Best used in\n" +
            "                           conjunction with --subtitle-forced.")
    private String subtitle;

    @CommandLine.Option(names = "--subname", description = "Set subtitle track name(s).\n" +
            "                           Separate tracks by commas.")
    private String subname;

    @CommandLine.Option(names = "--subtitle-forced", description = "Only display subtitles from the selected stream\n" +
            "                           if the subtitle has the forced flag set. The\n" +
            "                           values in 'string' are indexes into the\n" +
            "                           subtitle list specified with '--subtitle'.\n" +
            "                           Separate tracks by commas.\n" +
            "                           Example: \"1,2,3\" for multiple tracks.\n" +
            "                           If \"string\" is omitted, the first track is\n" +
            "                           forced.")
    private String subtitleForced;

    @CommandLine.Option(names = "--subtitle-default", description = "Flag the selected subtitle as the default\n" +
            "                           subtitle to be displayed upon playback.  Setting\n" +
            "                           no default means no subtitle will be displayed\n" +
            "                           automatically. 'number' is an index into the\n" +
            "                           subtitle list specified with '--subtitle'.\n" +
            "                           \"none\" may be used to override an automatically\n" +
            "                           selected default subtitle track.")
    private String subtitleDefault;

    @CommandLine.Option(names = "--native-language", description = "Specify your language preference. When the first\n" +
            "                           audio track does not match your native language\n" +
            "                           then select the first subtitle that does. When\n" +
            "                           used in conjunction with --native-dub the audio\n" +
            "                           track is changed in preference to subtitles.\n" +
            "                           Provide the language's ISO 639-2 code\n" +
            "                           (e.g. fre, eng, spa, dut, et cetera)")
    private String nativeLanguage;

    @CommandLine.Option(names = "--native-dub", description = "Used in conjunction with --native-language\n" +
            "                           requests that if no audio tracks are selected the\n" +
            "                           default selected audio track will be the first\n" +
            "                           one that matches the --native-language. If there\n" +
            "                           are no matching audio tracks then the first\n" +
            "                           matching subtitle track is used instead.")
    private String nativeDub;

    @CommandLine.Option(names = "--srt-file", description = "SubRip SRT filename(s), separated by commas.")
    private String srtFile;

    @CommandLine.Option(names = "--srt-codeset", description = "Character codeset(s) that the SRT file(s) are\n" +
            "                           encoded as, separated by commas.\n" +
            "                           If not specified, 'latin1' is assumed.\n" +
            "                           Command 'iconv -l' provides a list of valid codesets.")
    private String srtCodeset;

    @CommandLine.Option(names = "--srt-offset", description = "Offset (in milliseconds) to apply to the SRT\n" +
            "                           file(s), separated by commas. If not specified,\n" +
            "                           zero is assumed. Offsets may be negative.")
    private String srtOffset;

    @CommandLine.Option(names = "--srt-lang", description = "SRT track language as an ISO 639-2 code\n" +
            "                           (e.g. fre, eng, spa, dut, et cetera)\n" +
            "                           If not specified, then 'und' is used.\n" +
            "                           Separate by commas.")
    private String srtLang;

    @CommandLine.Option(names = "--srt-default", description = "Flag the selected SRT as the default subtitle\n" +
            "                           to be displayed during playback.\n" +
            "                           Setting no default means no subtitle will be\n" +
            "                           automatically displayed. If 'number' is omitted,\n" +
            "                           the first SRT is the default.\n" +
            "                           'number' is a 1-based index into the 'srt-file' list")
    private String srtDefault;

    @CommandLine.Option(names = "--srt-burn", description = "'Burn' the selected SRT subtitle into\n" +
            "                           the video track.\n" +
            "                           If 'number' is omitted, the first SRT is burned.\n" +
            "                           'number' is a 1-based index into the 'srt-file' list")
    private String srtBurn;

    @CommandLine.Option(names = "--ssa-file", description = "SubStationAlpha SSA filename(s), separated by\n" +
            "                           commas.")
    private String ssaFile;

    @CommandLine.Option(names = "--ssa-offset", description = "Offset (in milliseconds) to apply to the SSA\n" +
            "                           file(s), separated by commas. If not specified,\n" +
            "                           zero is assumed. Offsets may be negative.")
    private String ssaOffset;

    @CommandLine.Option(names = "--ssa-lang", description = "SSA track language as an ISO 639-2 code\n" +
            "                           (e.g. fre, eng, spa, dut, et cetera)\n" +
            "                           If not specified, then 'und' is used.\n" +
            "                           Separate by commas.")
    private String ssaLang;

    @CommandLine.Option(names = "--ssa-default", description = "Flag the selected SSA as the default subtitle\n" +
            "                           to be displayed during playback.\n" +
            "                           Setting no default means no subtitle will be\n" +
            "                           automatically displayed. If 'number' is omitted,\n" +
            "                           the first SSA is the default.\n" +
            "                           'number' is a 1-based index into the 'ssa-file' list")
    private String ssaDefault;

    @CommandLine.Option(names = "--ssa-burn", description = "'Burn' the selected SSA subtitle into\n" +
            "                           the video track.\n" +
            "                           If 'number' is omitted, the first SSA is burned.\n" +
            "                           'number' is a 1-based index into the 'ssa-file' list")
    private String ssaBurn;
}
