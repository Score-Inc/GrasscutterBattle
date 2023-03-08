// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerTeamSelectReq.proto

package emu.grasscutter.net.proto;

public final class TowerTeamSelectReqOuterClass {
  private TowerTeamSelectReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerTeamSelectReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerTeamSelectReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 floor_id = 2;</code>
     * @return The floorId.
     */
    int getFloorId();

    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> 
        getTowerTeamListList();
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam getTowerTeamList(int index);
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    int getTowerTeamListCount();
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
        getTowerTeamListOrBuilderList();
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: KPDIMECADLO
   * CmdId: 2434
   * </pre>
   *
   * Protobuf type {@code TowerTeamSelectReq}
   */
  public static final class TowerTeamSelectReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerTeamSelectReq)
      TowerTeamSelectReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerTeamSelectReq.newBuilder() to construct.
    private TowerTeamSelectReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerTeamSelectReq() {
      towerTeamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerTeamSelectReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.class, emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.Builder.class);
    }

    public static final int FLOOR_ID_FIELD_NUMBER = 2;
    private int floorId_ = 0;
    /**
     * <code>uint32 floor_id = 2;</code>
     * @return The floorId.
     */
    @java.lang.Override
    public int getFloorId() {
      return floorId_;
    }

    public static final int TOWER_TEAM_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> towerTeamList_;
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
      return towerTeamList_;
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
        getTowerTeamListOrBuilderList() {
      return towerTeamList_;
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    @java.lang.Override
    public int getTowerTeamListCount() {
      return towerTeamList_.size();
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam getTowerTeamList(int index) {
      return towerTeamList_.get(index);
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(
        int index) {
      return towerTeamList_.get(index);
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
      if (floorId_ != 0) {
        output.writeUInt32(2, floorId_);
      }
      for (int i = 0; i < towerTeamList_.size(); i++) {
        output.writeMessage(8, towerTeamList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (floorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, floorId_);
      }
      for (int i = 0; i < towerTeamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, towerTeamList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq other = (emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq) obj;

      if (getFloorId()
          != other.getFloorId()) return false;
      if (!getTowerTeamListList()
          .equals(other.getTowerTeamListList())) return false;
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
      hash = (37 * hash) + FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloorId();
      if (getTowerTeamListCount() > 0) {
        hash = (37 * hash) + TOWER_TEAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTowerTeamListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq prototype) {
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
     * Name: KPDIMECADLO
     * CmdId: 2434
     * </pre>
     *
     * Protobuf type {@code TowerTeamSelectReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerTeamSelectReq)
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.class, emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.newBuilder()
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
        floorId_ = 0;
        if (towerTeamListBuilder_ == null) {
          towerTeamList_ = java.util.Collections.emptyList();
        } else {
          towerTeamList_ = null;
          towerTeamListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq build() {
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq buildPartial() {
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq result = new emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq result) {
        if (towerTeamListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            towerTeamList_ = java.util.Collections.unmodifiableList(towerTeamList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.towerTeamList_ = towerTeamList_;
        } else {
          result.towerTeamList_ = towerTeamListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.floorId_ = floorId_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq) {
          return mergeFrom((emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq other) {
        if (other == emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.getDefaultInstance()) return this;
        if (other.getFloorId() != 0) {
          setFloorId(other.getFloorId());
        }
        if (towerTeamListBuilder_ == null) {
          if (!other.towerTeamList_.isEmpty()) {
            if (towerTeamList_.isEmpty()) {
              towerTeamList_ = other.towerTeamList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTowerTeamListIsMutable();
              towerTeamList_.addAll(other.towerTeamList_);
            }
            onChanged();
          }
        } else {
          if (!other.towerTeamList_.isEmpty()) {
            if (towerTeamListBuilder_.isEmpty()) {
              towerTeamListBuilder_.dispose();
              towerTeamListBuilder_ = null;
              towerTeamList_ = other.towerTeamList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              towerTeamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTowerTeamListFieldBuilder() : null;
            } else {
              towerTeamListBuilder_.addAllMessages(other.towerTeamList_);
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
              case 16: {
                floorId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 66: {
                emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam m =
                    input.readMessage(
                        emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.parser(),
                        extensionRegistry);
                if (towerTeamListBuilder_ == null) {
                  ensureTowerTeamListIsMutable();
                  towerTeamList_.add(m);
                } else {
                  towerTeamListBuilder_.addMessage(m);
                }
                break;
              } // case 66
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

      private int floorId_ ;
      /**
       * <code>uint32 floor_id = 2;</code>
       * @return The floorId.
       */
      @java.lang.Override
      public int getFloorId() {
        return floorId_;
      }
      /**
       * <code>uint32 floor_id = 2;</code>
       * @param value The floorId to set.
       * @return This builder for chaining.
       */
      public Builder setFloorId(int value) {
        
        floorId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floor_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        floorId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> towerTeamList_ =
        java.util.Collections.emptyList();
      private void ensureTowerTeamListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          towerTeamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam>(towerTeamList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> towerTeamListBuilder_;

      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
        if (towerTeamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(towerTeamList_);
        } else {
          return towerTeamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public int getTowerTeamListCount() {
        if (towerTeamListBuilder_ == null) {
          return towerTeamList_.size();
        } else {
          return towerTeamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam getTowerTeamList(int index) {
        if (towerTeamListBuilder_ == null) {
          return towerTeamList_.get(index);
        } else {
          return towerTeamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder setTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam value) {
        if (towerTeamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerTeamListIsMutable();
          towerTeamList_.set(index, value);
          onChanged();
        } else {
          towerTeamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder setTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          towerTeamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder addTowerTeamList(emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam value) {
        if (towerTeamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(value);
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder addTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam value) {
        if (towerTeamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(index, value);
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder addTowerTeamList(
          emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(builderForValue.build());
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder addTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder addAllTowerTeamList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> values) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, towerTeamList_);
          onChanged();
        } else {
          towerTeamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder clearTowerTeamList() {
        if (towerTeamListBuilder_ == null) {
          towerTeamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          towerTeamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public Builder removeTowerTeamList(int index) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.remove(index);
          onChanged();
        } else {
          towerTeamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder getTowerTeamListBuilder(
          int index) {
        return getTowerTeamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(
          int index) {
        if (towerTeamListBuilder_ == null) {
          return towerTeamList_.get(index);  } else {
          return towerTeamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
           getTowerTeamListOrBuilderList() {
        if (towerTeamListBuilder_ != null) {
          return towerTeamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(towerTeamList_);
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder() {
        return getTowerTeamListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder(
          int index) {
        return getTowerTeamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder> 
           getTowerTeamListBuilderList() {
        return getTowerTeamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
          getTowerTeamListFieldBuilder() {
        if (towerTeamListBuilder_ == null) {
          towerTeamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder>(
                  towerTeamList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          towerTeamList_ = null;
        }
        return towerTeamListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerTeamSelectReq)
    }

    // @@protoc_insertion_point(class_scope:TowerTeamSelectReq)
    private static final emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq();
    }

    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerTeamSelectReq>
        PARSER = new com.google.protobuf.AbstractParser<TowerTeamSelectReq>() {
      @java.lang.Override
      public TowerTeamSelectReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerTeamSelectReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerTeamSelectReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerTeamSelectReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerTeamSelectReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TowerTeamSelectReq.proto\032\017TowerTeam.pr" +
      "oto\"K\n\022TowerTeamSelectReq\022\020\n\010floor_id\030\002 " +
      "\001(\r\022#\n\017tower_team_list\030\010 \003(\0132\n.TowerTeam" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TowerTeamOuterClass.getDescriptor(),
        });
    internal_static_TowerTeamSelectReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerTeamSelectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerTeamSelectReq_descriptor,
        new java.lang.String[] { "FloorId", "TowerTeamList", });
    emu.grasscutter.net.proto.TowerTeamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
