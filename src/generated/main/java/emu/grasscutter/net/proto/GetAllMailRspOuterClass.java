// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAllMailRsp.proto

package emu.grasscutter.net.proto;

public final class GetAllMailRspOuterClass {
  private GetAllMailRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAllMailRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAllMailRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_truncated = 10;</code>
     * @return The isTruncated.
     */
    boolean getIsTruncated();

    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> 
        getMailListList();
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    emu.grasscutter.net.proto.MailDataOuterClass.MailData getMailList(int index);
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    int getMailListCount();
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
        getMailListOrBuilderList();
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
        int index);

    /**
     * <code>bool is_collected = 13;</code>
     * @return The isCollected.
     */
    boolean getIsCollected();
  }
  /**
   * <pre>
   * Name: LLAGIAGEIKA
   * CmdId: 1407
   * </pre>
   *
   * Protobuf type {@code GetAllMailRsp}
   */
  public static final class GetAllMailRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAllMailRsp)
      GetAllMailRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAllMailRsp.newBuilder() to construct.
    private GetAllMailRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAllMailRsp() {
      mailList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAllMailRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetAllMailRspOuterClass.internal_static_GetAllMailRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.class, emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_TRUNCATED_FIELD_NUMBER = 10;
    private boolean isTruncated_ = false;
    /**
     * <code>bool is_truncated = 10;</code>
     * @return The isTruncated.
     */
    @java.lang.Override
    public boolean getIsTruncated() {
      return isTruncated_;
    }

    public static final int MAIL_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> mailList_;
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> getMailListList() {
      return mailList_;
    }
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
        getMailListOrBuilderList() {
      return mailList_;
    }
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    @java.lang.Override
    public int getMailListCount() {
      return mailList_.size();
    }
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MailDataOuterClass.MailData getMailList(int index) {
      return mailList_.get(index);
    }
    /**
     * <code>repeated .MailData mail_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
        int index) {
      return mailList_.get(index);
    }

    public static final int IS_COLLECTED_FIELD_NUMBER = 13;
    private boolean isCollected_ = false;
    /**
     * <code>bool is_collected = 13;</code>
     * @return The isCollected.
     */
    @java.lang.Override
    public boolean getIsCollected() {
      return isCollected_;
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
      if (isTruncated_ != false) {
        output.writeBool(10, isTruncated_);
      }
      for (int i = 0; i < mailList_.size(); i++) {
        output.writeMessage(11, mailList_.get(i));
      }
      if (isCollected_ != false) {
        output.writeBool(13, isCollected_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTruncated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isTruncated_);
      }
      for (int i = 0; i < mailList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, mailList_.get(i));
      }
      if (isCollected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isCollected_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp other = (emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsTruncated()
          != other.getIsTruncated()) return false;
      if (!getMailListList()
          .equals(other.getMailListList())) return false;
      if (getIsCollected()
          != other.getIsCollected()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_TRUNCATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTruncated());
      if (getMailListCount() > 0) {
        hash = (37 * hash) + MAIL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailListList().hashCode();
      }
      hash = (37 * hash) + IS_COLLECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCollected());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp prototype) {
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
     * Name: LLAGIAGEIKA
     * CmdId: 1407
     * </pre>
     *
     * Protobuf type {@code GetAllMailRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAllMailRsp)
        emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetAllMailRspOuterClass.internal_static_GetAllMailRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.class, emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.newBuilder()
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
        retcode_ = 0;
        isTruncated_ = false;
        if (mailListBuilder_ == null) {
          mailList_ = java.util.Collections.emptyList();
        } else {
          mailList_ = null;
          mailListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        isCollected_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp build() {
        emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp buildPartial() {
        emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp result = new emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp result) {
        if (mailListBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            mailList_ = java.util.Collections.unmodifiableList(mailList_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.mailList_ = mailList_;
        } else {
          result.mailList_ = mailListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isTruncated_ = isTruncated_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isCollected_ = isCollected_;
        }
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
        if (other instanceof emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp other) {
        if (other == emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsTruncated() != false) {
          setIsTruncated(other.getIsTruncated());
        }
        if (mailListBuilder_ == null) {
          if (!other.mailList_.isEmpty()) {
            if (mailList_.isEmpty()) {
              mailList_ = other.mailList_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureMailListIsMutable();
              mailList_.addAll(other.mailList_);
            }
            onChanged();
          }
        } else {
          if (!other.mailList_.isEmpty()) {
            if (mailListBuilder_.isEmpty()) {
              mailListBuilder_.dispose();
              mailListBuilder_ = null;
              mailList_ = other.mailList_;
              bitField0_ = (bitField0_ & ~0x00000004);
              mailListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMailListFieldBuilder() : null;
            } else {
              mailListBuilder_.addAllMessages(other.mailList_);
            }
          }
        }
        if (other.getIsCollected() != false) {
          setIsCollected(other.getIsCollected());
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
              case 80: {
                isTruncated_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 90: {
                emu.grasscutter.net.proto.MailDataOuterClass.MailData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.MailDataOuterClass.MailData.parser(),
                        extensionRegistry);
                if (mailListBuilder_ == null) {
                  ensureMailListIsMutable();
                  mailList_.add(m);
                } else {
                  mailListBuilder_.addMessage(m);
                }
                break;
              } // case 90
              case 104: {
                isCollected_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 104
              case 120: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isTruncated_ ;
      /**
       * <code>bool is_truncated = 10;</code>
       * @return The isTruncated.
       */
      @java.lang.Override
      public boolean getIsTruncated() {
        return isTruncated_;
      }
      /**
       * <code>bool is_truncated = 10;</code>
       * @param value The isTruncated to set.
       * @return This builder for chaining.
       */
      public Builder setIsTruncated(boolean value) {
        
        isTruncated_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_truncated = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTruncated() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isTruncated_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> mailList_ =
        java.util.Collections.emptyList();
      private void ensureMailListIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          mailList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MailDataOuterClass.MailData>(mailList_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MailDataOuterClass.MailData, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder, emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> mailListBuilder_;

      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData> getMailListList() {
        if (mailListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mailList_);
        } else {
          return mailListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public int getMailListCount() {
        if (mailListBuilder_ == null) {
          return mailList_.size();
        } else {
          return mailListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData getMailList(int index) {
        if (mailListBuilder_ == null) {
          return mailList_.get(index);
        } else {
          return mailListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder setMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.set(index, value);
          onChanged();
        } else {
          mailListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder setMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.set(index, builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder addMailList(emu.grasscutter.net.proto.MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.add(value);
          onChanged();
        } else {
          mailListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder addMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.add(index, value);
          onChanged();
        } else {
          mailListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder addMailList(
          emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.add(builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder addMailList(
          int index, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.add(index, builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder addAllMailList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailData> values) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mailList_);
          onChanged();
        } else {
          mailListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder clearMailList() {
        if (mailListBuilder_ == null) {
          mailList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          mailListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public Builder removeMailList(int index) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.remove(index);
          onChanged();
        } else {
          mailListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder getMailListBuilder(
          int index) {
        return getMailListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
          int index) {
        if (mailListBuilder_ == null) {
          return mailList_.get(index);  } else {
          return mailListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
           getMailListOrBuilderList() {
        if (mailListBuilder_ != null) {
          return mailListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mailList_);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder addMailListBuilder() {
        return getMailListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MailDataOuterClass.MailData.getDefaultInstance());
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder addMailListBuilder(
          int index) {
        return getMailListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MailDataOuterClass.MailData.getDefaultInstance());
      }
      /**
       * <code>repeated .MailData mail_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder> 
           getMailListBuilderList() {
        return getMailListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MailDataOuterClass.MailData, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder, emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder> 
          getMailListFieldBuilder() {
        if (mailListBuilder_ == null) {
          mailListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MailDataOuterClass.MailData, emu.grasscutter.net.proto.MailDataOuterClass.MailData.Builder, emu.grasscutter.net.proto.MailDataOuterClass.MailDataOrBuilder>(
                  mailList_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          mailList_ = null;
        }
        return mailListBuilder_;
      }

      private boolean isCollected_ ;
      /**
       * <code>bool is_collected = 13;</code>
       * @return The isCollected.
       */
      @java.lang.Override
      public boolean getIsCollected() {
        return isCollected_;
      }
      /**
       * <code>bool is_collected = 13;</code>
       * @param value The isCollected to set.
       * @return This builder for chaining.
       */
      public Builder setIsCollected(boolean value) {
        
        isCollected_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_collected = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCollected() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isCollected_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:GetAllMailRsp)
    }

    // @@protoc_insertion_point(class_scope:GetAllMailRsp)
    private static final emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp();
    }

    public static emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAllMailRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetAllMailRsp>() {
      @java.lang.Override
      public GetAllMailRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetAllMailRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAllMailRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetAllMailRspOuterClass.GetAllMailRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllMailRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllMailRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GetAllMailRsp.proto\032\016MailData.proto\"j\n" +
      "\rGetAllMailRsp\022\017\n\007retcode\030\017 \001(\005\022\024\n\014is_tr" +
      "uncated\030\n \001(\010\022\034\n\tmail_list\030\013 \003(\0132\t.MailD" +
      "ata\022\024\n\014is_collected\030\r \001(\010B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MailDataOuterClass.getDescriptor(),
        });
    internal_static_GetAllMailRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAllMailRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllMailRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsTruncated", "MailList", "IsCollected", });
    emu.grasscutter.net.proto.MailDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
