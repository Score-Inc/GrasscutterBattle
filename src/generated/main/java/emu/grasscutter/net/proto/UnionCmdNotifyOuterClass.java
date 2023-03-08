// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnionCmdNotify.proto

package emu.grasscutter.net.proto;

public final class UnionCmdNotifyOuterClass {
  private UnionCmdNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnionCmdNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnionCmdNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd> 
        getCmdListList();
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd getCmdList(int index);
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    int getCmdListCount();
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder> 
        getCmdListOrBuilderList();
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder getCmdListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: JHIIPBFFOAN
   * CmdId: 27
   * </pre>
   *
   * Protobuf type {@code UnionCmdNotify}
   */
  public static final class UnionCmdNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnionCmdNotify)
      UnionCmdNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnionCmdNotify.newBuilder() to construct.
    private UnionCmdNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnionCmdNotify() {
      cmdList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnionCmdNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.internal_static_UnionCmdNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.internal_static_UnionCmdNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.class, emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.Builder.class);
    }

    public static final int CMD_LIST_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd> cmdList_;
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd> getCmdListList() {
      return cmdList_;
    }
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder> 
        getCmdListOrBuilderList() {
      return cmdList_;
    }
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    @java.lang.Override
    public int getCmdListCount() {
      return cmdList_.size();
    }
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd getCmdList(int index) {
      return cmdList_.get(index);
    }
    /**
     * <code>repeated .UnionCmd cmd_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder getCmdListOrBuilder(
        int index) {
      return cmdList_.get(index);
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
      for (int i = 0; i < cmdList_.size(); i++) {
        output.writeMessage(15, cmdList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < cmdList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, cmdList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify other = (emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify) obj;

      if (!getCmdListList()
          .equals(other.getCmdListList())) return false;
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
      if (getCmdListCount() > 0) {
        hash = (37 * hash) + CMD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCmdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify prototype) {
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
     * Name: JHIIPBFFOAN
     * CmdId: 27
     * </pre>
     *
     * Protobuf type {@code UnionCmdNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnionCmdNotify)
        emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.internal_static_UnionCmdNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.internal_static_UnionCmdNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.class, emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.newBuilder()
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
        if (cmdListBuilder_ == null) {
          cmdList_ = java.util.Collections.emptyList();
        } else {
          cmdList_ = null;
          cmdListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.internal_static_UnionCmdNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify build() {
        emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify buildPartial() {
        emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify result = new emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify result) {
        if (cmdListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            cmdList_ = java.util.Collections.unmodifiableList(cmdList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.cmdList_ = cmdList_;
        } else {
          result.cmdList_ = cmdListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify result) {
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
        if (other instanceof emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify) {
          return mergeFrom((emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify other) {
        if (other == emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify.getDefaultInstance()) return this;
        if (cmdListBuilder_ == null) {
          if (!other.cmdList_.isEmpty()) {
            if (cmdList_.isEmpty()) {
              cmdList_ = other.cmdList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCmdListIsMutable();
              cmdList_.addAll(other.cmdList_);
            }
            onChanged();
          }
        } else {
          if (!other.cmdList_.isEmpty()) {
            if (cmdListBuilder_.isEmpty()) {
              cmdListBuilder_.dispose();
              cmdListBuilder_ = null;
              cmdList_ = other.cmdList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              cmdListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCmdListFieldBuilder() : null;
            } else {
              cmdListBuilder_.addAllMessages(other.cmdList_);
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
              case 122: {
                emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd m =
                    input.readMessage(
                        emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.parser(),
                        extensionRegistry);
                if (cmdListBuilder_ == null) {
                  ensureCmdListIsMutable();
                  cmdList_.add(m);
                } else {
                  cmdListBuilder_.addMessage(m);
                }
                break;
              } // case 122
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

      private java.util.List<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd> cmdList_ =
        java.util.Collections.emptyList();
      private void ensureCmdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cmdList_ = new java.util.ArrayList<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd>(cmdList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder> cmdListBuilder_;

      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd> getCmdListList() {
        if (cmdListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cmdList_);
        } else {
          return cmdListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public int getCmdListCount() {
        if (cmdListBuilder_ == null) {
          return cmdList_.size();
        } else {
          return cmdListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd getCmdList(int index) {
        if (cmdListBuilder_ == null) {
          return cmdList_.get(index);
        } else {
          return cmdListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder setCmdList(
          int index, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd value) {
        if (cmdListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCmdListIsMutable();
          cmdList_.set(index, value);
          onChanged();
        } else {
          cmdListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder setCmdList(
          int index, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder builderForValue) {
        if (cmdListBuilder_ == null) {
          ensureCmdListIsMutable();
          cmdList_.set(index, builderForValue.build());
          onChanged();
        } else {
          cmdListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder addCmdList(emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd value) {
        if (cmdListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCmdListIsMutable();
          cmdList_.add(value);
          onChanged();
        } else {
          cmdListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder addCmdList(
          int index, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd value) {
        if (cmdListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCmdListIsMutable();
          cmdList_.add(index, value);
          onChanged();
        } else {
          cmdListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder addCmdList(
          emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder builderForValue) {
        if (cmdListBuilder_ == null) {
          ensureCmdListIsMutable();
          cmdList_.add(builderForValue.build());
          onChanged();
        } else {
          cmdListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder addCmdList(
          int index, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder builderForValue) {
        if (cmdListBuilder_ == null) {
          ensureCmdListIsMutable();
          cmdList_.add(index, builderForValue.build());
          onChanged();
        } else {
          cmdListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder addAllCmdList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd> values) {
        if (cmdListBuilder_ == null) {
          ensureCmdListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, cmdList_);
          onChanged();
        } else {
          cmdListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder clearCmdList() {
        if (cmdListBuilder_ == null) {
          cmdList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          cmdListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public Builder removeCmdList(int index) {
        if (cmdListBuilder_ == null) {
          ensureCmdListIsMutable();
          cmdList_.remove(index);
          onChanged();
        } else {
          cmdListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder getCmdListBuilder(
          int index) {
        return getCmdListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder getCmdListOrBuilder(
          int index) {
        if (cmdListBuilder_ == null) {
          return cmdList_.get(index);  } else {
          return cmdListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder> 
           getCmdListOrBuilderList() {
        if (cmdListBuilder_ != null) {
          return cmdListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cmdList_);
        }
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder addCmdListBuilder() {
        return getCmdListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.getDefaultInstance());
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder addCmdListBuilder(
          int index) {
        return getCmdListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.getDefaultInstance());
      }
      /**
       * <code>repeated .UnionCmd cmd_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder> 
           getCmdListBuilderList() {
        return getCmdListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder> 
          getCmdListFieldBuilder() {
        if (cmdListBuilder_ == null) {
          cmdListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmd.Builder, emu.grasscutter.net.proto.UnionCmdOuterClass.UnionCmdOrBuilder>(
                  cmdList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          cmdList_ = null;
        }
        return cmdListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:UnionCmdNotify)
    }

    // @@protoc_insertion_point(class_scope:UnionCmdNotify)
    private static final emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify();
    }

    public static emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnionCmdNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnionCmdNotify>() {
      @java.lang.Override
      public UnionCmdNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnionCmdNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnionCmdNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnionCmdNotifyOuterClass.UnionCmdNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnionCmdNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnionCmdNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024UnionCmdNotify.proto\032\016UnionCmd.proto\"-" +
      "\n\016UnionCmdNotify\022\033\n\010cmd_list\030\017 \003(\0132\t.Uni" +
      "onCmdB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.UnionCmdOuterClass.getDescriptor(),
        });
    internal_static_UnionCmdNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnionCmdNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnionCmdNotify_descriptor,
        new java.lang.String[] { "CmdList", });
    emu.grasscutter.net.proto.UnionCmdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
