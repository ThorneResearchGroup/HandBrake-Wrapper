package tech.tresearchgroup.wrappers.handbrake.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class FilterOptions {
    @CommandLine.Option(names = "--comb-detect", description = "Detect interlace artifacts in frames.\n" +
            "                           If not accompanied by the decomb or deinterlace\n" +
            "                           filters, this filter only logs the interlaced\n" +
            "                           frame count to the activity log.\n" +
            "                           If accompanied by the decomb or deinterlace\n" +
            "                           filters, it causes these filters to selectively\n" +
            "                           deinterlace only those frames where interlacing\n" +
            "                           is detected.\n" +
            "                           Presets:\n" +
            "                               permissive\n" +
            "                               fast\n" +
            "                           Custom Format:\n" +
            "                               mode=m:spatial-metric=s:motion-thresh=m:\n" +
            "                               spatial-thresh=s:filter-mode=f:block-thresh=b:\n" +
            "                               block-width=b:block-height=b:disable=d\n" +
            "                           Default:\n" +
            "                               mode=3:spatial-metric=2:motion-thresh=1:\n" +
            "                               spatial-thresh=1:filter-mode=2:block-thresh=40:\n" +
            "                               block-width=16:block-height=16")
    private String combDetect;

    @CommandLine.Option(names = "--deinterlace", description = "Deinterlace video using FFmpeg yadif.\n" +
            "                           Presets:\n" +
            "                               skip-spatial\n" +
            "                               bob\n" +
            "                           Custom Format:\n" +
            "                               mode=m:parity=p\n" +
            "                           Default:\n" +
            "                               mode=3")
    private String deinterlace;

    @CommandLine.Option(names = "--decomb", description = "Deinterlace video using a combination of yadif,\n" +
            "                           blend, cubic, or EEDI2 interpolation.\n" +
            "                           Presets:\n" +
            "                               bob\n" +
            "                               eedi2\n" +
            "                               eedi2bob\n" +
            "                           Custom Format:\n" +
            "                               mode=m:magnitude-thresh=m:variance-thresh=v:\n" +
            "                               laplacian-thresh=l:dilation-thresh=d:\n" +
            "                               erosion-thresh=e:noise-thresh=n:\n" +
            "                               search-distance=s:postproc=p:parity=p\n" +
            "                           Default:\n" +
            "                               mode=7")
    private String decomb;

    @CommandLine.Option(names = "--detelecine", description = "Detelecine (ivtc) video with pullup filter\n" +
            "                           Note: this filter drops duplicate frames to\n" +
            "                           restore the pre-telecine framerate, unless you\n" +
            "                           specify a constant framerate\n" +
            "                           (--rate 29.97 --cfr)\n" +
            "                           Custom Format:\n" +
            "                               skip-left=s:skip-right=s:skip-top=s:\n" +
            "                               skip-bottom=s:strict-breaks=s:plane=p:parity=p:\n" +
            "                               disable=d\n" +
            "                           Default:\n" +
            "                               skip-left=1:skip-right=1:skip-top=4:\n" +
            "                               skip-bottom=4:plane=0")
    private String detelecine;

    @CommandLine.Option(names = "--hqdn3d", description = "Denoise video with hqdn3d filter\n" +
            "                           Presets:\n" +
            "                               ultralight\n" +
            "                               light\n" +
            "                               medium\n" +
            "                               strong\n" +
            "                           Custom Format:\n" +
            "                               y-spatial=y:cb-spatial=c:cr-spatial=c:\n" +
            "                               y-temporal=y:cb-temporal=c:cr-temporal=c\n" +
            "                           Default:\n" +
            "                               y-spatial=3:cb-spatial=2:cr-spatial=2:\n" +
            "                               y-temporal=2:cb-temporal=3:cr-temporal=3")
    private String hqdn3d;

    @CommandLine.Option(names = "--nlmeans", description = "Denoise video with NLMeans filter\n" +
            "                           Presets:\n" +
            "                               ultralight\n" +
            "                               light\n" +
            "                               medium\n" +
            "                               strong\n" +
            "                           Custom Format:\n" +
            "                               y-strength=y:y-origin-tune=y:y-patch-size=y:\n" +
            "                               y-range=y:y-frame-count=y:y-prefilter=y:\n" +
            "                               cb-strength=c:cb-origin-tune=c:cb-patch-size=c:\n" +
            "                               cb-range=c:cb-frame-count=c:cb-prefilter=c:\n" +
            "                               cr-strength=c:cr-origin-tune=c:cr-patch-size=c:\n" +
            "                               cr-range=c:cr-frame-count=c:cr-prefilter=c:\n" +
            "                               threads=t\n" +
            "                           Default:\n" +
            "                               y-strength=6:y-origin-tune=1:y-patch-size=7:\n" +
            "                               y-range=3:y-frame-count=2:y-prefilter=0:\n" +
            "                               cb-strength=6:cb-origin-tune=1:cb-patch-size=7:\n" +
            "                               cb-range=3:cb-frame-count=2:cb-prefilter=0")
    private String nlmeans;

    @CommandLine.Option(names = "--nlmeans-tune", description = "Tune NLMeans filter to content type\n" +
            "                           Tunes:\n" +
            "                               none\n" +
            "                               film\n" +
            "                               grain\n" +
            "                               highmotion\n" +
            "                               animation\n" +
            "                               tape\n" +
            "                               sprite\n" +
            "                           Applies to NLMeans presets only (does not affect\n" +
            "                           custom settings)")
    private String nlmeansTune;

    @CommandLine.Option(names = "--chroma-smooth", description = "Sharpen video with chroma smooth filter\n" +
            "                           Presets:\n" +
            "                               ultralight\n" +
            "                               light\n" +
            "                               medium\n" +
            "                               strong\n" +
            "                               stronger\n" +
            "                               verystrong\n" +
            "                           Custom Format:\n" +
            "                               cb-strength=c:cb-size=c:cr-strength=c:cr-size=c\n" +
            "                           Default:\n" +
            "                               cb-strength=1.2:cb-size=7")
    private String chromaSmooth;

    @CommandLine.Option(names = "--chroma-smooth-tune", description = "Tune chroma smooth filter\n" +
            "                           Tunes:\n" +
            "                               none\n" +
            "                               tiny\n" +
            "                               small\n" +
            "                               medium\n" +
            "                               wide\n" +
            "                               verywide\n" +
            "                                 Applies to chroma smooth presets only (does\n" +
            "                                 not affect custom settings)")
    private String chromaSmoothTune;

    @CommandLine.Option(names = "--unsharp", description = "Sharpen video with unsharp filter\n" +
            "                           Presets:\n" +
            "                               ultralight\n" +
            "                               light\n" +
            "                               medium\n" +
            "                               strong\n" +
            "                               stronger\n" +
            "                               verystrong\n" +
            "                           Custom Format:\n" +
            "                               y-strength=y:y-size=y:cb-strength=c:cb-size=c:\n" +
            "                               cr-strength=c:cr-size=c\n" +
            "                           Default:\n" +
            "                               y-strength=0.25:y-size=7:cb-strength=0.25:\n" +
            "                               cb-size=7")
    private String unsharp;

    @CommandLine.Option(names = "--unsharp-tune", description = "Tune unsharp filter\n" +
            "                           Tunes:\n" +
            "                               none\n" +
            "                               ultrafine\n" +
            "                               fine\n" +
            "                               medium\n" +
            "                               coarse\n" +
            "                               verycoarse\n" +
            "                           Applies to unsharp presets only (does not affect\n" +
            "                           custom settings)")
    private String unsharpTune;

    @CommandLine.Option(names = "--lapsharp", description = "Sharpen video with lapsharp filter\n" +
            "                           Presets:\n" +
            "                               ultralight\n" +
            "                               light\n" +
            "                               medium\n" +
            "                               strong\n" +
            "                               stronger\n" +
            "                               verystrong\n" +
            "                           Custom Format:\n" +
            "                               y-strength=y:y-kernel=y:cb-strength=c:\n" +
            "                               cb-kernel=c:cr-strength=c:cr-kernel=c\n" +
            "                           Default:\n" +
            "                               y-strength=0.2:y-kernel=isolap:cb-strength=0.2:\n" +
            "                               cb-kernel=isolap")
    private String lapsharp;

    @CommandLine.Option(names = "--lapsharp-tune", description = "Tune lapsharp filter\n" +
            "                           Tunes:\n" +
            "                               none\n" +
            "                               film\n" +
            "                               grain\n" +
            "                               animation\n" +
            "                               sprite\n" +
            "                           Applies to lapsharp presets only (does not affect\n" +
            "                           custom settings)")
    private String lapsharpTune;

    @CommandLine.Option(names = "--deblock", description = "Deblock video with avfilter deblock\n" +
            "                           Presets:\n" +
            "                               ultralight\n" +
            "                               light\n" +
            "                               medium\n" +
            "                               strong\n" +
            "                               stronger\n" +
            "                               verystrong\n" +
            "                           Custom Format:\n" +
            "                               strength=s:thresh=t:blocksize=b:disable=d\n" +
            "                           Default:\n" +
            "                               strength=strong:thresh=20")
    private String deblock;

    @CommandLine.Option(names = "--deblock-tune", description = "Tune deblock filter\n" +
            "                           Tunes:\n" +
            "                               small\n" +
            "                               medium\n" +
            "                               large\n" +
            "                           Applies to deblock presets only (does not affect\n" +
            "                           custom settings)")
    private String deblockTune;

    @CommandLine.Option(names = "--rotate", description = "Rotate image or flip its axes.\n" +
            "                           angle rotates clockwise, can be one of:\n" +
            "                               0, 90, 180, 270\n" +
            "                           hflip=1 flips the image on the x axis (horizontally).\n" +
            "                           Custom Format:\n" +
            "                               angle=a:hflip=h:disable=d\n" +
            "                           Default:\n" +
            "                               angle=180:hflip=0")
    private String rotate;

    @CommandLine.Option(names = "--pad", description = "Pad image with borders (e.g. letterbox).\n" +
            "                           The padding color may be set (default black).\n" +
            "                           Color may be an HTML color name or RGB value.\n" +
            "                           The position of image in pad may also be set.\n" +
            "                           Custom Format:\n" +
            "                               width=w:height=h:color=c:x=x:y=y:top=t:bottom=b:\n" +
            "                               left=l:right=r")
    private String pad;

    @CommandLine.Option(names = "--colorspace", description = "Convert colorspace, transfer characteristics or color primaries.\n" +
            "                           Presets:\n" +
            "                               bt2020\n" +
            "                               bt709\n" +
            "                               bt601-6-525\n" +
            "                               bt601-6-625\n" +
            "                           Custom Format:\n" +
            "                               primaries=p:transfer=t:matrix=m:range=r:\n" +
            "                               tonemap=t:param=p:desat=d")
    private String colorspace;

    @CommandLine.Option(names = "--grayscale", description = "Grayscale encoding")
    private boolean grayscale;
}
