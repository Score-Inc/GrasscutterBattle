// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcMusicTrack.proto

package emu.grasscutter.net.proto;

public final class UgcMusicTrackOuterClass {
  private UgcMusicTrackOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcMusicTrackOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcMusicTrack)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote> 
        getMusicNoteListList();
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote getMusicNoteList(int index);
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    int getMusicNoteListCount();
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder> 
        getMusicNoteListOrBuilderList();
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder getMusicNoteListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: PNNCHCKBNDL
   * </pre>
   *
   * Protobuf type {@code UgcMusicTrack}
   */
  public static final class UgcMusicTrack extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcMusicTrack)
      UgcMusicTrackOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcMusicTrack.newBuilder() to construct.
    private UgcMusicTrack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcMusicTrack() {
      musicNoteList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcMusicTrack();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UgcMusicTrackOuterClass.internal_static_UgcMusicTrack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UgcMusicTrackOuterClass.internal_static_UgcMusicTrack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.class, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder.class);
    }

    public static final int MUSIC_NOTE_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote> musicNoteList_;
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote> getMusicNoteListList() {
      return musicNoteList_;
    }
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder> 
        getMusicNoteListOrBuilderList() {
      return musicNoteList_;
    }
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    @java.lang.Override
    public int getMusicNoteListCount() {
      return musicNoteList_.size();
    }
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote getMusicNoteList(int index) {
      return musicNoteList_.get(index);
    }
    /**
     * <code>repeated .UgcMusicNote music_note_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder getMusicNoteListOrBuilder(
        int index) {
      return musicNoteList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < musicNoteList_.size(); i++) {
        output.writeMessage(2, musicNoteList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < musicNoteList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, musicNoteList_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack other = (emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack) obj;

      if (!getMusicNoteListList()
          .equals(other.getMusicNoteListList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getMusicNoteListCount() > 0) {
        hash = (37 * hash) + MUSIC_NOTE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMusicNoteListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: PNNCHCKBNDL
     * </pre>
     *
     * Protobuf type {@code UgcMusicTrack}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcMusicTrack)
        emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UgcMusicTrackOuterClass.internal_static_UgcMusicTrack_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UgcMusicTrackOuterClass.internal_static_UgcMusicTrack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.class, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        if (musicNoteListBuilder_ == null) {
          musicNoteList_ = java.util.Collections.emptyList();
        } else {
          musicNoteList_ = null;
          musicNoteListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UgcMusicTrackOuterClass.internal_static_UgcMusicTrack_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack build() {
        emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack buildPartial() {
        emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack result = new emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack result) {
        if (musicNoteListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            musicNoteList_ = java.util.Collections.unmodifiableList(musicNoteList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.musicNoteList_ = musicNoteList_;
        } else {
          result.musicNoteList_ = musicNoteListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack result) {
        int from_bitField0_ = bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack) {
          return mergeFrom((emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack other) {
        if (other == emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.getDefaultInstance()) return this;
        if (musicNoteListBuilder_ == null) {
          if (!other.musicNoteList_.isEmpty()) {
            if (musicNoteList_.isEmpty()) {
              musicNoteList_ = other.musicNoteList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMusicNoteListIsMutable();
              musicNoteList_.addAll(other.musicNoteList_);
            }
            onChanged();
          }
        } else {
          if (!other.musicNoteList_.isEmpty()) {
            if (musicNoteListBuilder_.isEmpty()) {
              musicNoteListBuilder_.dispose();
              musicNoteListBuilder_ = null;
              musicNoteList_ = other.musicNoteList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              musicNoteListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMusicNoteListFieldBuilder() : null;
            } else {
              musicNoteListBuilder_.addAllMessages(other.musicNoteList_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 18: {
                emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote m =
                    input.readMessage(
                        emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.parser(),
                        extensionRegistry);
                if (musicNoteListBuilder_ == null) {
                  ensureMusicNoteListIsMutable();
                  musicNoteList_.add(m);
                } else {
                  musicNoteListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote> musicNoteList_ =
        java.util.Collections.emptyList();
      private void ensureMusicNoteListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          musicNoteList_ = new java.util.ArrayList<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote>(musicNoteList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder> musicNoteListBuilder_;

      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote> getMusicNoteListList() {
        if (musicNoteListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(musicNoteList_);
        } else {
          return musicNoteListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public int getMusicNoteListCount() {
        if (musicNoteListBuilder_ == null) {
          return musicNoteList_.size();
        } else {
          return musicNoteListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote getMusicNoteList(int index) {
        if (musicNoteListBuilder_ == null) {
          return musicNoteList_.get(index);
        } else {
          return musicNoteListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder setMusicNoteList(
          int index, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote value) {
        if (musicNoteListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicNoteListIsMutable();
          musicNoteList_.set(index, value);
          onChanged();
        } else {
          musicNoteListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder setMusicNoteList(
          int index, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder builderForValue) {
        if (musicNoteListBuilder_ == null) {
          ensureMusicNoteListIsMutable();
          musicNoteList_.set(index, builderForValue.build());
          onChanged();
        } else {
          musicNoteListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder addMusicNoteList(emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote value) {
        if (musicNoteListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicNoteListIsMutable();
          musicNoteList_.add(value);
          onChanged();
        } else {
          musicNoteListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder addMusicNoteList(
          int index, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote value) {
        if (musicNoteListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicNoteListIsMutable();
          musicNoteList_.add(index, value);
          onChanged();
        } else {
          musicNoteListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder addMusicNoteList(
          emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder builderForValue) {
        if (musicNoteListBuilder_ == null) {
          ensureMusicNoteListIsMutable();
          musicNoteList_.add(builderForValue.build());
          onChanged();
        } else {
          musicNoteListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder addMusicNoteList(
          int index, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder builderForValue) {
        if (musicNoteListBuilder_ == null) {
          ensureMusicNoteListIsMutable();
          musicNoteList_.add(index, builderForValue.build());
          onChanged();
        } else {
          musicNoteListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder addAllMusicNoteList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote> values) {
        if (musicNoteListBuilder_ == null) {
          ensureMusicNoteListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, musicNoteList_);
          onChanged();
        } else {
          musicNoteListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder clearMusicNoteList() {
        if (musicNoteListBuilder_ == null) {
          musicNoteList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          musicNoteListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public Builder removeMusicNoteList(int index) {
        if (musicNoteListBuilder_ == null) {
          ensureMusicNoteListIsMutable();
          musicNoteList_.remove(index);
          onChanged();
        } else {
          musicNoteListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder getMusicNoteListBuilder(
          int index) {
        return getMusicNoteListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder getMusicNoteListOrBuilder(
          int index) {
        if (musicNoteListBuilder_ == null) {
          return musicNoteList_.get(index);  } else {
          return musicNoteListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder> 
           getMusicNoteListOrBuilderList() {
        if (musicNoteListBuilder_ != null) {
          return musicNoteListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(musicNoteList_);
        }
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder addMusicNoteListBuilder() {
        return getMusicNoteListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.getDefaultInstance());
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder addMusicNoteListBuilder(
          int index) {
        return getMusicNoteListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.getDefaultInstance());
      }
      /**
       * <code>repeated .UgcMusicNote music_note_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder> 
           getMusicNoteListBuilderList() {
        return getMusicNoteListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder> 
          getMusicNoteListFieldBuilder() {
        if (musicNoteListBuilder_ == null) {
          musicNoteListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder>(
                  musicNoteList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          musicNoteList_ = null;
        }
        return musicNoteListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:UgcMusicTrack)
    }

    // @@protoc_insertion_point(class_scope:UgcMusicTrack)
    private static final emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack();
    }

    public static emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcMusicTrack>
        PARSER = new com.google.protobuf.AbstractParser<UgcMusicTrack>() {
      @java.lang.Override
      public UgcMusicTrack parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<UgcMusicTrack> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcMusicTrack> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcMusicTrack_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcMusicTrack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023UgcMusicTrack.proto\032\022UgcMusicNote.prot" +
      "o\"7\n\rUgcMusicTrack\022&\n\017music_note_list\030\002 " +
      "\003(\0132\r.UgcMusicNoteB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.UgcMusicNoteOuterClass.getDescriptor(),
        });
    internal_static_UgcMusicTrack_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcMusicTrack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcMusicTrack_descriptor,
        new java.lang.String[] { "MusicNoteList", });
    emu.grasscutter.net.proto.UgcMusicNoteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
