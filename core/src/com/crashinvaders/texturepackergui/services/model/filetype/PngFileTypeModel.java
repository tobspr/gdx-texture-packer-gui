package com.crashinvaders.texturepackergui.services.model.filetype;

import com.badlogic.gdx.graphics.Pixmap;
import com.crashinvaders.texturepackergui.events.FileTypePropertyChangedEvent;
import com.crashinvaders.texturepackergui.events.FileTypePropertyChangedEvent.Property;
import com.crashinvaders.texturepackergui.services.model.FileTypeType;
import com.crashinvaders.texturepackergui.services.model.compression.PngCompressionModel;

public class PngFileTypeModel extends FileTypeModel {
    private Pixmap.Format encoding = Pixmap.Format.RGBA8888;
    private PngCompressionModel compression = null;

    @Override
    public FileTypeType getType() {
        return FileTypeType.PNG;
    }

    public Pixmap.Format getEncoding() {
        return encoding;
    }

    public void setEncoding(Pixmap.Format encoding) {
        this.encoding = encoding;

        if (eventDispatcher != null) {
            eventDispatcher.postEvent(new FileTypePropertyChangedEvent(this, Property.PNG_ENCODING));
        }
    }

    public <T extends PngCompressionModel> T getCompression() {
        return (T)compression;
    }

    public void setCompression(PngCompressionModel compression) {
        this.compression = compression;

        if (eventDispatcher != null) {
            eventDispatcher.postEvent(new FileTypePropertyChangedEvent(this, Property.PNG_COMPRESSION));
        }
    }
}