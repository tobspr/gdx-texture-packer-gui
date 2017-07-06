package com.crashinvaders.texturepackergui.services.model.filetype;

import com.crashinvaders.texturepackergui.events.FileTypePropertyChangedEvent;
import com.crashinvaders.texturepackergui.events.FileTypePropertyChangedEvent.Property;
import com.crashinvaders.texturepackergui.services.model.FileTypeType;

//TODO add .ktx and .zktx extensions to old file cleaner list
public class KtxFileTypeModel extends FileTypeModel {
    private Format format = Format.ETC2;
    private EncodingETC1 encodingEtc1 = EncodingETC1.RGB;
    private EncodingETC2 encodingEtc2 = EncodingETC2.RGBA8;
    private boolean zipping = true;

    @Override
    public FileTypeType getType() {
        return FileTypeType.KTX;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        if (this.format == format) return;

        this.format = format;

        if (eventDispatcher != null) {
            eventDispatcher.postEvent(new FileTypePropertyChangedEvent(this, Property.KTX_FORMAT));
        }
    }

    public EncodingETC1 getEncodingEtc1() {
        return encodingEtc1;
    }

    public void setEncodingEtc1(EncodingETC1 encodingEtc1) {
        if (this.encodingEtc1 == encodingEtc1) return;

        this.encodingEtc1 = encodingEtc1;

        if (eventDispatcher != null) {
            eventDispatcher.postEvent(new FileTypePropertyChangedEvent(this, Property.KTX_ENCODING));
        }
    }

    public EncodingETC2 getEncodingEtc2() {
        return encodingEtc2;
    }

    public void setEncodingEtc2(EncodingETC2 encodingEtc2) {
        if (this.encodingEtc2 == encodingEtc2) return;

        this.encodingEtc2 = encodingEtc2;

        if (eventDispatcher != null) {
            eventDispatcher.postEvent(new FileTypePropertyChangedEvent(this, Property.KTX_ENCODING));
        }
    }

    public boolean isZipping() {
        return zipping;
    }

    public void setZipping(boolean zipping) {
        if (this.zipping == zipping) return;

        this.zipping = zipping;

        if (eventDispatcher != null) {
            eventDispatcher.postEvent(new FileTypePropertyChangedEvent(this, Property.KTX_ZIPPING));
        }
    }

    public enum Format {
        ETC1,
        ETC2
    }

    public enum EncodingETC1 {
        RGB,
        RGBA
    }

    public enum EncodingETC2 {
        RGB8,
        SRGB8,
        RGBA8,
        SRGBA8,
        RGB8A1,
        SRGB8A1,
        R11,
        RG11
    }
}