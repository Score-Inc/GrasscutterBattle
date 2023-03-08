// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFollowRouteNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarFollowRouteNotifyOuterClass {
  private AvatarFollowRouteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFollowRouteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFollowRouteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 start_scene_time_ms = 13;</code>
     * @return The startSceneTimeMs.
     */
    int getStartSceneTimeMs();

    /**
     * <code>string client_params = 1;</code>
     * @return The clientParams.
     */
    java.lang.String getClientParams();
    /**
     * <code>string client_params = 1;</code>
     * @return The bytes for clientParams.
     */
    com.google.protobuf.ByteString
        getClientParamsBytes();

    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 template_id = 10;</code>
     * @return The templateId.
     */
    int getTemplateId();

    /**
     * <code>.Route route = 3;</code>
     * @return Whether the route field is set.
     */
    boolean hasRoute();
    /**
     * <code>.Route route = 3;</code>
     * @return The route.
     */
    emu.grasscutter.net.proto.RouteOuterClass.Route getRoute();
    /**
     * <code>.Route route = 3;</code>
     */
    emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder();
  }
  /**
   * <pre>
   * Name: DOFGJNOPAOG
   * CmdId: 3300
   * </pre>
   *
   * Protobuf type {@code AvatarFollowRouteNotify}
   */
  public static final class AvatarFollowRouteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFollowRouteNotify)
      AvatarFollowRouteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFollowRouteNotify.newBuilder() to construct.
    private AvatarFollowRouteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFollowRouteNotify() {
      clientParams_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFollowRouteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.class, emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.Builder.class);
    }

    public static final int START_SCENE_TIME_MS_FIELD_NUMBER = 13;
    private int startSceneTimeMs_ = 0;
    /**
     * <code>uint32 start_scene_time_ms = 13;</code>
     * @return The startSceneTimeMs.
     */
    @java.lang.Override
    public int getStartSceneTimeMs() {
      return startSceneTimeMs_;
    }

    public static final int CLIENT_PARAMS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object clientParams_ = "";
    /**
     * <code>string client_params = 1;</code>
     * @return The clientParams.
     */
    @java.lang.Override
    public java.lang.String getClientParams() {
      java.lang.Object ref = clientParams_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientParams_ = s;
        return s;
      }
    }
    /**
     * <code>string client_params = 1;</code>
     * @return The bytes for clientParams.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientParamsBytes() {
      java.lang.Object ref = clientParams_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientParams_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 8;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int TEMPLATE_ID_FIELD_NUMBER = 10;
    private int templateId_ = 0;
    /**
     * <code>uint32 template_id = 10;</code>
     * @return The templateId.
     */
    @java.lang.Override
    public int getTemplateId() {
      return templateId_;
    }

    public static final int ROUTE_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.RouteOuterClass.Route route_;
    /**
     * <code>.Route route = 3;</code>
     * @return Whether the route field is set.
     */
    @java.lang.Override
    public boolean hasRoute() {
      return route_ != null;
    }
    /**
     * <code>.Route route = 3;</code>
     * @return The route.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RouteOuterClass.Route getRoute() {
      return route_ == null ? emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
    }
    /**
     * <code>.Route route = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
      return route_ == null ? emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientParams_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientParams_);
      }
      if (route_ != null) {
        output.writeMessage(3, getRoute());
      }
      if (entityId_ != 0) {
        output.writeUInt32(8, entityId_);
      }
      if (templateId_ != 0) {
        output.writeUInt32(10, templateId_);
      }
      if (startSceneTimeMs_ != 0) {
        output.writeUInt32(13, startSceneTimeMs_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientParams_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientParams_);
      }
      if (route_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getRoute());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, entityId_);
      }
      if (templateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, templateId_);
      }
      if (startSceneTimeMs_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, startSceneTimeMs_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify other = (emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) obj;

      if (getStartSceneTimeMs()
          != other.getStartSceneTimeMs()) return false;
      if (!getClientParams()
          .equals(other.getClientParams())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getTemplateId()
          != other.getTemplateId()) return false;
      if (hasRoute() != other.hasRoute()) return false;
      if (hasRoute()) {
        if (!getRoute()
            .equals(other.getRoute())) return false;
      }
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
      hash = (37 * hash) + START_SCENE_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + getStartSceneTimeMs();
      hash = (37 * hash) + CLIENT_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getClientParams().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateId();
      if (hasRoute()) {
        hash = (37 * hash) + ROUTE_FIELD_NUMBER;
        hash = (53 * hash) + getRoute().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify prototype) {
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
     * Name: DOFGJNOPAOG
     * CmdId: 3300
     * </pre>
     *
     * Protobuf type {@code AvatarFollowRouteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFollowRouteNotify)
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.class, emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.newBuilder()
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
        startSceneTimeMs_ = 0;
        clientParams_ = "";
        entityId_ = 0;
        templateId_ = 0;
        route_ = null;
        if (routeBuilder_ != null) {
          routeBuilder_.dispose();
          routeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify build() {
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result = new emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startSceneTimeMs_ = startSceneTimeMs_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.clientParams_ = clientParams_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.templateId_ = templateId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.route_ = routeBuilder_ == null
              ? route_
              : routeBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.getDefaultInstance()) return this;
        if (other.getStartSceneTimeMs() != 0) {
          setStartSceneTimeMs(other.getStartSceneTimeMs());
        }
        if (!other.getClientParams().isEmpty()) {
          clientParams_ = other.clientParams_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getTemplateId() != 0) {
          setTemplateId(other.getTemplateId());
        }
        if (other.hasRoute()) {
          mergeRoute(other.getRoute());
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
              case 10: {
                clientParams_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
              case 26: {
                input.readMessage(
                    getRouteFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000010;
                break;
              } // case 26
              case 64: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 80: {
                templateId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 104: {
                startSceneTimeMs_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private int startSceneTimeMs_ ;
      /**
       * <code>uint32 start_scene_time_ms = 13;</code>
       * @return The startSceneTimeMs.
       */
      @java.lang.Override
      public int getStartSceneTimeMs() {
        return startSceneTimeMs_;
      }
      /**
       * <code>uint32 start_scene_time_ms = 13;</code>
       * @param value The startSceneTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setStartSceneTimeMs(int value) {
        
        startSceneTimeMs_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_scene_time_ms = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSceneTimeMs() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startSceneTimeMs_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object clientParams_ = "";
      /**
       * <code>string client_params = 1;</code>
       * @return The clientParams.
       */
      public java.lang.String getClientParams() {
        java.lang.Object ref = clientParams_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientParams_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string client_params = 1;</code>
       * @return The bytes for clientParams.
       */
      public com.google.protobuf.ByteString
          getClientParamsBytes() {
        java.lang.Object ref = clientParams_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientParams_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string client_params = 1;</code>
       * @param value The clientParams to set.
       * @return This builder for chaining.
       */
      public Builder setClientParams(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        clientParams_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string client_params = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientParams() {
        clientParams_ = getDefaultInstance().getClientParams();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string client_params = 1;</code>
       * @param value The bytes for clientParams to set.
       * @return This builder for chaining.
       */
      public Builder setClientParamsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        clientParams_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int templateId_ ;
      /**
       * <code>uint32 template_id = 10;</code>
       * @return The templateId.
       */
      @java.lang.Override
      public int getTemplateId() {
        return templateId_;
      }
      /**
       * <code>uint32 template_id = 10;</code>
       * @param value The templateId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateId(int value) {
        
        templateId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 template_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        templateId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.RouteOuterClass.Route route_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RouteOuterClass.Route, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder, emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder> routeBuilder_;
      /**
       * <code>.Route route = 3;</code>
       * @return Whether the route field is set.
       */
      public boolean hasRoute() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>.Route route = 3;</code>
       * @return The route.
       */
      public emu.grasscutter.net.proto.RouteOuterClass.Route getRoute() {
        if (routeBuilder_ == null) {
          return route_ == null ? emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
        } else {
          return routeBuilder_.getMessage();
        }
      }
      /**
       * <code>.Route route = 3;</code>
       */
      public Builder setRoute(emu.grasscutter.net.proto.RouteOuterClass.Route value) {
        if (routeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          route_ = value;
        } else {
          routeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Route route = 3;</code>
       */
      public Builder setRoute(
          emu.grasscutter.net.proto.RouteOuterClass.Route.Builder builderForValue) {
        if (routeBuilder_ == null) {
          route_ = builderForValue.build();
        } else {
          routeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Route route = 3;</code>
       */
      public Builder mergeRoute(emu.grasscutter.net.proto.RouteOuterClass.Route value) {
        if (routeBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
            route_ != null &&
            route_ != emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance()) {
            getRouteBuilder().mergeFrom(value);
          } else {
            route_ = value;
          }
        } else {
          routeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Route route = 3;</code>
       */
      public Builder clearRoute() {
        bitField0_ = (bitField0_ & ~0x00000010);
        route_ = null;
        if (routeBuilder_ != null) {
          routeBuilder_.dispose();
          routeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Route route = 3;</code>
       */
      public emu.grasscutter.net.proto.RouteOuterClass.Route.Builder getRouteBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getRouteFieldBuilder().getBuilder();
      }
      /**
       * <code>.Route route = 3;</code>
       */
      public emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
        if (routeBuilder_ != null) {
          return routeBuilder_.getMessageOrBuilder();
        } else {
          return route_ == null ?
              emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
        }
      }
      /**
       * <code>.Route route = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RouteOuterClass.Route, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder, emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder> 
          getRouteFieldBuilder() {
        if (routeBuilder_ == null) {
          routeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.RouteOuterClass.Route, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder, emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder>(
                  getRoute(),
                  getParentForChildren(),
                  isClean());
          route_ = null;
        }
        return routeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AvatarFollowRouteNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarFollowRouteNotify)
    private static final emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify();
    }

    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFollowRouteNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFollowRouteNotify>() {
      @java.lang.Override
      public AvatarFollowRouteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarFollowRouteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFollowRouteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFollowRouteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFollowRouteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarFollowRouteNotify.proto\032\013Route.p" +
      "roto\"\214\001\n\027AvatarFollowRouteNotify\022\033\n\023star" +
      "t_scene_time_ms\030\r \001(\r\022\025\n\rclient_params\030\001" +
      " \001(\t\022\021\n\tentity_id\030\010 \001(\r\022\023\n\013template_id\030\n" +
      " \001(\r\022\025\n\005route\030\003 \001(\0132\006.RouteB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RouteOuterClass.getDescriptor(),
        });
    internal_static_AvatarFollowRouteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFollowRouteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFollowRouteNotify_descriptor,
        new java.lang.String[] { "StartSceneTimeMs", "ClientParams", "EntityId", "TemplateId", "Route", });
    emu.grasscutter.net.proto.RouteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
