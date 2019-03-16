package tensorflow

import scala.scalanative.native._

@link("tensorflow")
@extern
object CApi {
  private[CApi] trait _TF_DataType
  type TF_DataType = CUnsignedInt with _TF_DataType
  object TF_DataType {
    final val TF_FLOAT: TF_DataType = 1.toUInt.asInstanceOf[TF_DataType]
    final val TF_DOUBLE: TF_DataType = 2.toUInt.asInstanceOf[TF_DataType]
    final val TF_INT32: TF_DataType = 3.toUInt.asInstanceOf[TF_DataType]
    final val TF_UINT8: TF_DataType = 4.toUInt.asInstanceOf[TF_DataType]
    final val TF_INT16: TF_DataType = 5.toUInt.asInstanceOf[TF_DataType]
    final val TF_INT8: TF_DataType = 6.toUInt.asInstanceOf[TF_DataType]
    final val TF_STRING: TF_DataType = 7.toUInt.asInstanceOf[TF_DataType]
    final val TF_COMPLEX64: TF_DataType = 8.toUInt.asInstanceOf[TF_DataType]
    final val TF_COMPLEX: TF_DataType = 8.toUInt.asInstanceOf[TF_DataType]
    final val TF_INT64: TF_DataType = 9.toUInt.asInstanceOf[TF_DataType]
    final val TF_BOOL: TF_DataType = 10.toUInt.asInstanceOf[TF_DataType]
    final val TF_QINT8: TF_DataType = 11.toUInt.asInstanceOf[TF_DataType]
    final val TF_QUINT8: TF_DataType = 12.toUInt.asInstanceOf[TF_DataType]
    final val TF_QINT32: TF_DataType = 13.toUInt.asInstanceOf[TF_DataType]
    final val TF_BFLOAT16: TF_DataType = 14.toUInt.asInstanceOf[TF_DataType]
    final val TF_QINT16: TF_DataType = 15.toUInt.asInstanceOf[TF_DataType]
    final val TF_QUINT16: TF_DataType = 16.toUInt.asInstanceOf[TF_DataType]
    final val TF_UINT16: TF_DataType = 17.toUInt.asInstanceOf[TF_DataType]
    final val TF_COMPLEX128: TF_DataType = 18.toUInt.asInstanceOf[TF_DataType]
    final val TF_HALF: TF_DataType = 19.toUInt.asInstanceOf[TF_DataType]
    final val TF_RESOURCE: TF_DataType = 20.toUInt.asInstanceOf[TF_DataType]
    final val TF_VARIANT: TF_DataType = 21.toUInt.asInstanceOf[TF_DataType]
    final val TF_UINT32: TF_DataType = 22.toUInt.asInstanceOf[TF_DataType]
    final val TF_UINT64: TF_DataType = 23.toUInt.asInstanceOf[TF_DataType]
  }

  private[CApi] trait _TF_Code
  type TF_Code = CUnsignedInt with _TF_Code
  object TF_Code {
    final val TF_OK: TF_Code = 0.toUInt.asInstanceOf[TF_Code]
    final val TF_CANCELLED: TF_Code = 1.toUInt.asInstanceOf[TF_Code]
    final val TF_UNKNOWN: TF_Code = 2.toUInt.asInstanceOf[TF_Code]
    final val TF_INVALID_ARGUMENT: TF_Code = 3.toUInt.asInstanceOf[TF_Code]
    final val TF_DEADLINE_EXCEEDED: TF_Code = 4.toUInt.asInstanceOf[TF_Code]
    final val TF_NOT_FOUND: TF_Code = 5.toUInt.asInstanceOf[TF_Code]
    final val TF_ALREADY_EXISTS: TF_Code = 6.toUInt.asInstanceOf[TF_Code]
    final val TF_PERMISSION_DENIED: TF_Code = 7.toUInt.asInstanceOf[TF_Code]
    final val TF_UNAUTHENTICATED: TF_Code = 16.toUInt.asInstanceOf[TF_Code]
    final val TF_RESOURCE_EXHAUSTED: TF_Code = 8.toUInt.asInstanceOf[TF_Code]
    final val TF_FAILED_PRECONDITION: TF_Code = 9.toUInt.asInstanceOf[TF_Code]
    final val TF_ABORTED: TF_Code = 10.toUInt.asInstanceOf[TF_Code]
    final val TF_OUT_OF_RANGE: TF_Code = 11.toUInt.asInstanceOf[TF_Code]
    final val TF_UNIMPLEMENTED: TF_Code = 12.toUInt.asInstanceOf[TF_Code]
    final val TF_INTERNAL: TF_Code = 13.toUInt.asInstanceOf[TF_Code]
    final val TF_UNAVAILABLE: TF_Code = 14.toUInt.asInstanceOf[TF_Code]
    final val TF_DATA_LOSS: TF_Code = 15.toUInt.asInstanceOf[TF_Code]
  }

  private[CApi] trait _TF_AttrType
  type TF_AttrType = CUnsignedInt with _TF_AttrType
  object TF_AttrType {
    final val TF_ATTR_STRING: TF_AttrType = 0.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_INT: TF_AttrType = 1.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_FLOAT: TF_AttrType = 2.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_BOOL: TF_AttrType = 3.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_TYPE: TF_AttrType = 4.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_SHAPE: TF_AttrType = 5.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_TENSOR: TF_AttrType = 6.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_PLACEHOLDER: TF_AttrType = 7.toUInt.asInstanceOf[TF_AttrType]
    final val TF_ATTR_FUNC: TF_AttrType = 8.toUInt.asInstanceOf[TF_AttrType]
  }

  private[CApi] trait _TF_Status
  type TF_Status = CStruct0 with _TF_Status // incomplete type

  private[CApi] trait _TF_Buffer
  type struct_TF_Buffer = CStruct3[Ptr[Byte], CSize, CFunctionPtr2[Ptr[Byte], CSize, Unit]]
  type TF_Buffer = struct_TF_Buffer with _TF_Buffer

  private[CApi] trait _TF_Tensor
  type TF_Tensor = CStruct0 with _TF_Tensor // incomplete type

  private[CApi] trait _TF_SessionOptions
  type TF_SessionOptions = CStruct0 with _TF_SessionOptions // incomplete type

  private[CApi] trait _TF_Graph
  type TF_Graph = CStruct0 with _TF_Graph // incomplete type

  private[CApi] trait _TF_OperationDescription
  type TF_OperationDescription = CStruct0 with _TF_OperationDescription // incomplete type

  private[CApi] trait _TF_Operation
  type TF_Operation = CStruct0 with _TF_Operation // incomplete type

  private[CApi] trait _TF_Input
  type struct_TF_Input = CStruct2[Ptr[TF_Operation], CInt]
  type TF_Input = struct_TF_Input with _TF_Input

  private[CApi] trait _TF_Output
  type struct_TF_Output = CStruct2[Ptr[TF_Operation], CInt]
  type TF_Output = struct_TF_Output with _TF_Output

  private[CApi] trait _TF_Function
  type TF_Function = CStruct0 with _TF_Function // incomplete type

  private[CApi] trait _TF_FunctionOptions
  type TF_FunctionOptions = CStruct0 with _TF_FunctionOptions // incomplete type

  private[CApi] trait _TF_AttrMetadata
  type struct_TF_AttrMetadata = CStruct4[CUnsignedChar, CLongInt, TF_AttrType, CLongInt]
  type TF_AttrMetadata = struct_TF_AttrMetadata with _TF_AttrMetadata

  private[CApi] trait _TF_ImportGraphDefOptions
  type TF_ImportGraphDefOptions = CStruct0 with _TF_ImportGraphDefOptions // incomplete type

  private[CApi] trait _TF_ImportGraphDefResults
  type TF_ImportGraphDefResults = CStruct0 with _TF_ImportGraphDefResults // incomplete type

  private[CApi] trait _TF_WhileParams
  type struct_TF_WhileParams = CStruct8[CInt, Ptr[TF_Graph], Ptr[TF_Output], TF_Output, Ptr[TF_Graph], Ptr[TF_Output], Ptr[TF_Output], CString]
  type TF_WhileParams = struct_TF_WhileParams with _TF_WhileParams

  private[CApi] trait _TF_Session
  type TF_Session = CStruct0 with _TF_Session // incomplete type

  private[CApi] trait _TF_DeprecatedSession
  type TF_DeprecatedSession = CStruct0 with _TF_DeprecatedSession // incomplete type

  private[CApi] trait _TF_DeviceList
  type TF_DeviceList = CStruct0 with _TF_DeviceList // incomplete type

  private[CApi] trait _TF_Library
  type TF_Library = CStruct0 with _TF_Library // incomplete type

  private[CApi] trait _TF_ApiDefMap
  type TF_ApiDefMap = CStruct0 with _TF_ApiDefMap // incomplete type

  private[CApi] trait _TF_Server
  type TF_Server = CStruct0 with _TF_Server // incomplete type

  def TF_Version(): CString = extern
  def TF_DataTypeSize(dt: TF_DataType): CSize = extern
  def TF_NewStatus(): Ptr[TF_Status] = extern
  def TF_DeleteStatus(p0: Ptr[TF_Status]): Unit = extern
  def TF_SetStatus(s: Ptr[TF_Status], TF_Code: TF_Code, msg: CString): Unit = extern
  def TF_GetCode(s: Ptr[TF_Status]): TF_Code = extern
  def TF_Message(s: Ptr[TF_Status]): CString = extern
  def TF_NewBufferFromString(proto: Ptr[Byte], proto_len: CSize): Ptr[TF_Buffer] = extern
  def TF_NewBuffer(): Ptr[TF_Buffer] = extern
  def TF_DeleteBuffer(p0: Ptr[TF_Buffer]): Unit = extern
  def TF_NewTensor(p0: TF_DataType, dims: Ptr[CLongInt], num_dims: CInt, data: Ptr[Byte], len: CSize, deallocator: CFunctionPtr3[Ptr[Byte], CSize, Ptr[Byte], Unit], deallocator_arg: Ptr[Byte]): Ptr[TF_Tensor] = extern
  def TF_AllocateTensor(p0: TF_DataType, dims: Ptr[CLongInt], num_dims: CInt, len: CSize): Ptr[TF_Tensor] = extern
  def TF_TensorMaybeMove(tensor: Ptr[TF_Tensor]): Ptr[TF_Tensor] = extern
  def TF_DeleteTensor(p0: Ptr[TF_Tensor]): Unit = extern
  def TF_TensorType(p0: Ptr[TF_Tensor]): TF_DataType = extern
  def TF_NumDims(p0: Ptr[TF_Tensor]): CInt = extern
  def TF_Dim(tensor: Ptr[TF_Tensor], dim_index: CInt): CLongInt = extern
  def TF_TensorByteSize(p0: Ptr[TF_Tensor]): CSize = extern
  def TF_TensorData(p0: Ptr[TF_Tensor]): Ptr[Byte] = extern
  def TF_TensorElementCount(tensor: Ptr[TF_Tensor]): CLongInt = extern
  def TF_TensorBitcastFrom(from: Ptr[TF_Tensor], `type`: TF_DataType, to: Ptr[TF_Tensor], new_dims: Ptr[CLongInt], num_new_dims: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_StringEncode(src: CString, src_len: CSize, dst: CString, dst_len: CSize, status: Ptr[TF_Status]): CSize = extern
  def TF_StringDecode(src: CString, src_len: CSize, dst: Ptr[CString], dst_len: Ptr[CSize], status: Ptr[TF_Status]): CSize = extern
  def TF_StringEncodedSize(len: CSize): CSize = extern
  def TF_NewSessionOptions(): Ptr[TF_SessionOptions] = extern
  def TF_SetTarget(options: Ptr[TF_SessionOptions], target: CString): Unit = extern
  def TF_SetConfig(options: Ptr[TF_SessionOptions], proto: Ptr[Byte], proto_len: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_DeleteSessionOptions(p0: Ptr[TF_SessionOptions]): Unit = extern
  def TF_NewGraph(): Ptr[TF_Graph] = extern
  def TF_DeleteGraph(p0: Ptr[TF_Graph]): Unit = extern
  @name("scalanative_TF_GraphSetTensorShape")
  def TF_GraphSetTensorShape(graph: Ptr[TF_Graph], output: Ptr[TF_Output], dims: Ptr[CLongInt], status: Ptr[TF_Status]): Unit = extern
  @name("scalanative_TF_GraphGetTensorNumDims")
  def TF_GraphGetTensorNumDims(graph: Ptr[TF_Graph], output: Ptr[TF_Output], status: Ptr[TF_Status]): CInt = extern
  @name("scalanative_TF_GraphGetTensorShape")
  def TF_GraphGetTensorShape(graph: Ptr[TF_Graph], output: Ptr[TF_Output], dims: Ptr[CLongInt], num_dims: CInt, status: Ptr[TF_Status]): Unit = extern
  @name("scalanative_TF_AddInput")
  def TF_AddInput(desc: Ptr[TF_OperationDescription], input: Ptr[TF_Output]): Unit = extern
  @name("scalanative_TF_OperationOutputType")
  def TF_OperationOutputType(oper_out: Ptr[TF_Output], res: Ptr[TF_DataType]): Ptr[TF_DataType] = extern
  @name("scalanative_TF_OperationInputType")
  def TF_OperationInputType(oper_in: Ptr[TF_Input], res: Ptr[TF_DataType]): Ptr[TF_DataType] = extern
  @name("scalanative_TF_OperationInput")
  def TF_OperationInput(oper_in: Ptr[TF_Input], res: Ptr[TF_Output]): Ptr[TF_DataType] = extern
  @name("scalanative_TF_OperationOutputNumConsumers")
  def TF_OperationOutputNumConsumers(oper_out: Ptr[TF_Output]): CInt = extern
  @name("scalanative_TF_OperationOutputConsumers")
  def TF_OperationOutputConsumers(oper_out: Ptr[TF_Output], consumers: Ptr[TF_Input], max_consumers: CInt): Unit = extern
  @name("scalanative_TF_OperationGetAttrMetadata")
  def TF_OperationGetAttrMetadata(oper: Ptr[TF_Operation], attr_name: CString, status: Ptr[TF_Status], res: Ptr[TF_AttrMetadata]): Ptr[TF_AttrMetadata] = extern
  @name("scalanative_TF_ImportGraphDefOptionsAddInputMapping")
  def TF_ImportGraphDefOptionsAddInputMapping(opts: Ptr[TF_ImportGraphDefOptions], src_name: CString, src_index: CInt, dst: Ptr[TF_Output]): Unit = extern
//  @name("scalanative_TF_NewWhile")
//  def TF_NewWhile(g: Ptr[TF_Graph], inputs: Ptr[TF_Output], ninputs: CInt, status: Ptr[TF_Status], res: Ptr[TF_WhileParams]): Ptr[TF_WhileParams] = extern
  @name("scalanative_TF_TryEvaluateConstant")
  def TF_TryEvaluateConstant(graph: Ptr[TF_Graph], output: Ptr[TF_Output], result: Ptr[Ptr[TF_Tensor]], status: Ptr[TF_Status]): CUnsignedChar = extern
  @name("scalanative_TF_GetOpList")
  def TF_GetOpList(lib_handle: Ptr[TF_Library], res: Ptr[TF_Buffer]): Ptr[TF_Buffer] = extern
  def TF_NewOperation(graph: Ptr[TF_Graph], op_type: CString, oper_name: CString): Ptr[TF_OperationDescription] = extern
  def TF_SetDevice(desc: Ptr[TF_OperationDescription], device: CString): Unit = extern
  def TF_AddInputList(desc: Ptr[TF_OperationDescription], inputs: Ptr[TF_Output], num_inputs: CInt): Unit = extern
  def TF_AddControlInput(desc: Ptr[TF_OperationDescription], input: Ptr[TF_Operation]): Unit = extern
  def TF_ColocateWith(desc: Ptr[TF_OperationDescription], op: Ptr[TF_Operation]): Unit = extern
  def TF_SetAttrString(desc: Ptr[TF_OperationDescription], attr_name: CString, value: Ptr[Byte], length: CSize): Unit = extern
  def TF_SetAttrStringList(desc: Ptr[TF_OperationDescription], attr_name: CString, values: Ptr[Ptr[Byte]], lengths: Ptr[CSize], num_values: CInt): Unit = extern
  def TF_SetAttrInt(desc: Ptr[TF_OperationDescription], attr_name: CString, value: CLongInt): Unit = extern
  def TF_SetAttrIntList(desc: Ptr[TF_OperationDescription], attr_name: CString, values: Ptr[CLongInt], num_values: CInt): Unit = extern
  def TF_SetAttrFloat(desc: Ptr[TF_OperationDescription], attr_name: CString, value: CFloat): Unit = extern
  def TF_SetAttrFloatList(desc: Ptr[TF_OperationDescription], attr_name: CString, values: Ptr[CFloat], num_values: CInt): Unit = extern
  def TF_SetAttrBool(desc: Ptr[TF_OperationDescription], attr_name: CString, value: CUnsignedChar): Unit = extern
  def TF_SetAttrBoolList(desc: Ptr[TF_OperationDescription], attr_name: CString, values: Ptr[CUnsignedChar], num_values: CInt): Unit = extern
  def TF_SetAttrType(desc: Ptr[TF_OperationDescription], attr_name: CString, value: TF_DataType): Unit = extern
  def TF_SetAttrTypeList(desc: Ptr[TF_OperationDescription], attr_name: CString, values: Ptr[TF_DataType], num_values: CInt): Unit = extern
  def TF_SetAttrPlaceholder(desc: Ptr[TF_OperationDescription], attr_name: CString, placeholder: CString): Unit = extern
  def TF_SetAttrFuncName(desc: Ptr[TF_OperationDescription], attr_name: CString, value: CString, length: CSize): Unit = extern
  def TF_SetAttrShape(desc: Ptr[TF_OperationDescription], attr_name: CString, dims: Ptr[CLongInt], num_dims: CInt): Unit = extern
  def TF_SetAttrShapeList(desc: Ptr[TF_OperationDescription], attr_name: CString, dims: Ptr[Ptr[CLongInt]], num_dims: Ptr[CInt], num_shapes: CInt): Unit = extern
  def TF_SetAttrTensorShapeProto(desc: Ptr[TF_OperationDescription], attr_name: CString, proto: Ptr[Byte], proto_len: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_SetAttrTensorShapeProtoList(desc: Ptr[TF_OperationDescription], attr_name: CString, protos: Ptr[Ptr[Byte]], proto_lens: Ptr[CInt], num_shapes: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_SetAttrTensor(desc: Ptr[TF_OperationDescription], attr_name: CString, value: Ptr[TF_Tensor], status: Ptr[TF_Status]): Unit = extern
  def TF_SetAttrTensorList(desc: Ptr[TF_OperationDescription], attr_name: CString, values: Ptr[Ptr[TF_Tensor]], num_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_SetAttrValueProto(desc: Ptr[TF_OperationDescription], attr_name: CString, proto: Ptr[Byte], proto_len: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_FinishOperation(desc: Ptr[TF_OperationDescription], status: Ptr[TF_Status]): Ptr[TF_Operation] = extern
  def TF_OperationName(oper: Ptr[TF_Operation]): CString = extern
  def TF_OperationOpType(oper: Ptr[TF_Operation]): CString = extern
  def TF_OperationDevice(oper: Ptr[TF_Operation]): CString = extern
  def TF_OperationNumOutputs(oper: Ptr[TF_Operation]): CInt = extern
  def TF_OperationOutputListLength(oper: Ptr[TF_Operation], arg_name: CString, status: Ptr[TF_Status]): CInt = extern
  def TF_OperationNumInputs(oper: Ptr[TF_Operation]): CInt = extern
  def TF_OperationInputListLength(oper: Ptr[TF_Operation], arg_name: CString, status: Ptr[TF_Status]): CInt = extern
  def TF_OperationNumControlInputs(oper: Ptr[TF_Operation]): CInt = extern
  def TF_OperationGetControlInputs(oper: Ptr[TF_Operation], control_inputs: Ptr[Ptr[TF_Operation]], max_control_inputs: CInt): CInt = extern
  def TF_OperationNumControlOutputs(oper: Ptr[TF_Operation]): CInt = extern
  def TF_OperationGetControlOutputs(oper: Ptr[TF_Operation], control_outputs: Ptr[Ptr[TF_Operation]], max_control_outputs: CInt): CInt = extern
  def TF_OperationGetAttrString(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[Byte], max_length: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrStringList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[Ptr[Byte]], lengths: Ptr[CSize], max_values: CInt, storage: Ptr[Byte], storage_size: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrInt(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[CLongInt], status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrIntList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[CLongInt], max_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrFloat(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[CFloat], status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrFloatList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[CFloat], max_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrBool(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[CUnsignedChar], status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrBoolList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[CUnsignedChar], max_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrType(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[TF_DataType], status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrTypeList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[TF_DataType], max_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrShape(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[CLongInt], num_dims: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrShapeList(oper: Ptr[TF_Operation], attr_name: CString, dims: Ptr[Ptr[CLongInt]], num_dims: Ptr[CInt], num_shapes: CInt, storage: Ptr[CLongInt], storage_size: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrTensorShapeProto(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrTensorShapeProtoList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[Ptr[TF_Buffer]], max_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrTensor(oper: Ptr[TF_Operation], attr_name: CString, value: Ptr[Ptr[TF_Tensor]], status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrTensorList(oper: Ptr[TF_Operation], attr_name: CString, values: Ptr[Ptr[TF_Tensor]], max_values: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_OperationGetAttrValueProto(oper: Ptr[TF_Operation], attr_name: CString, output_attr_value: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_GraphOperationByName(graph: Ptr[TF_Graph], oper_name: CString): Ptr[TF_Operation] = extern
  def TF_GraphNextOperation(graph: Ptr[TF_Graph], pos: Ptr[CSize]): Ptr[TF_Operation] = extern
  def TF_GraphToGraphDef(graph: Ptr[TF_Graph], output_graph_def: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_GraphGetOpDef(graph: Ptr[TF_Graph], op_name: CString, output_op_def: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_GraphVersions(graph: Ptr[TF_Graph], output_version_def: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_NewImportGraphDefOptions(): Ptr[TF_ImportGraphDefOptions] = extern
  def TF_DeleteImportGraphDefOptions(opts: Ptr[TF_ImportGraphDefOptions]): Unit = extern
  def TF_ImportGraphDefOptionsSetPrefix(opts: Ptr[TF_ImportGraphDefOptions], prefix: CString): Unit = extern
  def TF_ImportGraphDefOptionsSetDefaultDevice(opts: Ptr[TF_ImportGraphDefOptions], device: CString): Unit = extern
  def TF_ImportGraphDefOptionsSetUniquifyNames(opts: Ptr[TF_ImportGraphDefOptions], uniquify_names: CUnsignedChar): Unit = extern
  def TF_ImportGraphDefOptionsSetUniquifyPrefix(opts: Ptr[TF_ImportGraphDefOptions], uniquify_prefix: CUnsignedChar): Unit = extern
  def TF_ImportGraphDefOptionsRemapControlDependency(opts: Ptr[TF_ImportGraphDefOptions], src_name: CString, dst: Ptr[TF_Operation]): Unit = extern
  def TF_ImportGraphDefOptionsAddControlDependency(opts: Ptr[TF_ImportGraphDefOptions], oper: Ptr[TF_Operation]): Unit = extern
  def TF_ImportGraphDefOptionsAddReturnOutput(opts: Ptr[TF_ImportGraphDefOptions], oper_name: CString, index: CInt): Unit = extern
  def TF_ImportGraphDefOptionsNumReturnOutputs(opts: Ptr[TF_ImportGraphDefOptions]): CInt = extern
  def TF_ImportGraphDefOptionsAddReturnOperation(opts: Ptr[TF_ImportGraphDefOptions], oper_name: CString): Unit = extern
  def TF_ImportGraphDefOptionsNumReturnOperations(opts: Ptr[TF_ImportGraphDefOptions]): CInt = extern
  def TF_ImportGraphDefResultsReturnOutputs(results: Ptr[TF_ImportGraphDefResults], num_outputs: Ptr[CInt], outputs: Ptr[Ptr[TF_Output]]): Unit = extern
  def TF_ImportGraphDefResultsReturnOperations(results: Ptr[TF_ImportGraphDefResults], num_opers: Ptr[CInt], opers: Ptr[Ptr[Ptr[TF_Operation]]]): Unit = extern
  def TF_ImportGraphDefResultsMissingUnusedInputMappings(results: Ptr[TF_ImportGraphDefResults], num_missing_unused_input_mappings: Ptr[CInt], src_names: Ptr[Ptr[CString]], src_indexes: Ptr[Ptr[CInt]]): Unit = extern
  def TF_DeleteImportGraphDefResults(results: Ptr[TF_ImportGraphDefResults]): Unit = extern
  def TF_GraphImportGraphDefWithResults(graph: Ptr[TF_Graph], graph_def: Ptr[TF_Buffer], options: Ptr[TF_ImportGraphDefOptions], status: Ptr[TF_Status]): Ptr[TF_ImportGraphDefResults] = extern
  def TF_GraphImportGraphDefWithReturnOutputs(graph: Ptr[TF_Graph], graph_def: Ptr[TF_Buffer], options: Ptr[TF_ImportGraphDefOptions], return_outputs: Ptr[TF_Output], num_return_outputs: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_GraphImportGraphDef(graph: Ptr[TF_Graph], graph_def: Ptr[TF_Buffer], options: Ptr[TF_ImportGraphDefOptions], status: Ptr[TF_Status]): Unit = extern
  def TF_GraphCopyFunction(g: Ptr[TF_Graph], func: Ptr[TF_Function], grad: Ptr[TF_Function], status: Ptr[TF_Status]): Unit = extern
  def TF_GraphNumFunctions(g: Ptr[TF_Graph]): CInt = extern
  def TF_GraphGetFunctions(g: Ptr[TF_Graph], funcs: Ptr[Ptr[TF_Function]], max_func: CInt, status: Ptr[TF_Status]): CInt = extern
  def TF_OperationToNodeDef(oper: Ptr[TF_Operation], output_node_def: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_FinishWhile(params: Ptr[TF_WhileParams], status: Ptr[TF_Status], outputs: Ptr[TF_Output]): Unit = extern
  def TF_AbortWhile(params: Ptr[TF_WhileParams]): Unit = extern
  def TF_AddGradients(g: Ptr[TF_Graph], y: Ptr[TF_Output], ny: CInt, x: Ptr[TF_Output], nx: CInt, dx: Ptr[TF_Output], status: Ptr[TF_Status], dy: Ptr[TF_Output]): Unit = extern
  def TF_AddGradientsWithPrefix(g: Ptr[TF_Graph], prefix: CString, y: Ptr[TF_Output], ny: CInt, x: Ptr[TF_Output], nx: CInt, dx: Ptr[TF_Output], status: Ptr[TF_Status], dy: Ptr[TF_Output]): Unit = extern
  def TF_GraphToFunction(fn_body: Ptr[TF_Graph], fn_name: CString, append_hash_to_fn_name: CUnsignedChar, num_opers: CInt, opers: Ptr[Ptr[TF_Operation]], ninputs: CInt, inputs: Ptr[TF_Output], noutputs: CInt, outputs: Ptr[TF_Output], output_names: Ptr[CString], opts: Ptr[TF_FunctionOptions], description: CString, status: Ptr[TF_Status]): Ptr[TF_Function] = extern
  def TF_GraphToFunctionWithControlOutputs(fn_body: Ptr[TF_Graph], fn_name: CString, append_hash_to_fn_name: CUnsignedChar, num_opers: CInt, opers: Ptr[Ptr[TF_Operation]], ninputs: CInt, inputs: Ptr[TF_Output], noutputs: CInt, outputs: Ptr[TF_Output], output_names: Ptr[CString], ncontrol_outputs: CInt, control_outputs: Ptr[Ptr[TF_Operation]], control_output_names: Ptr[CString], opts: Ptr[TF_FunctionOptions], description: CString, status: Ptr[TF_Status]): Ptr[TF_Function] = extern
  def TF_FunctionName(func: Ptr[TF_Function]): CString = extern
  def TF_FunctionToFunctionDef(func: Ptr[TF_Function], output_func_def: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_FunctionImportFunctionDef(proto: Ptr[Byte], proto_len: CSize, status: Ptr[TF_Status]): Ptr[TF_Function] = extern
  def TF_FunctionSetAttrValueProto(func: Ptr[TF_Function], attr_name: CString, proto: Ptr[Byte], proto_len: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_FunctionGetAttrValueProto(func: Ptr[TF_Function], attr_name: CString, output_attr_value: Ptr[TF_Buffer], status: Ptr[TF_Status]): Unit = extern
  def TF_DeleteFunction(func: Ptr[TF_Function]): Unit = extern
  def TF_NewSession(graph: Ptr[TF_Graph], opts: Ptr[TF_SessionOptions], status: Ptr[TF_Status]): Ptr[TF_Session] = extern
  def TF_LoadSessionFromSavedModel(session_options: Ptr[TF_SessionOptions], run_options: Ptr[TF_Buffer], export_dir: CString, tags: Ptr[CString], tags_len: CSize, graph: Ptr[TF_Graph], meta_graph_def: Ptr[TF_Buffer], status: Ptr[TF_Status]): Ptr[TF_Session] = extern
  def TF_CloseSession(p0: Ptr[TF_Session], status: Ptr[TF_Status]): Unit = extern
  def TF_DeleteSession(p0: Ptr[TF_Session], status: Ptr[TF_Status]): Unit = extern
  def TF_SessionRun(session: Ptr[TF_Session], run_options: Ptr[TF_Buffer], inputs: Ptr[TF_Output], input_values: Ptr[Ptr[TF_Tensor]], ninputs: CInt, outputs: Ptr[TF_Output], output_values: Ptr[Ptr[TF_Tensor]], noutputs: CInt, target_opers: Ptr[Ptr[TF_Operation]], ntargets: CInt, run_metadata: Ptr[TF_Buffer], p0: Ptr[TF_Status]): Unit = extern
  def TF_SessionPRunSetup(p0: Ptr[TF_Session], inputs: Ptr[TF_Output], ninputs: CInt, outputs: Ptr[TF_Output], noutputs: CInt, target_opers: Ptr[Ptr[TF_Operation]], ntargets: CInt, handle: Ptr[CString], p1: Ptr[TF_Status]): Unit = extern
  def TF_SessionPRun(p0: Ptr[TF_Session], handle: CString, inputs: Ptr[TF_Output], input_values: Ptr[Ptr[TF_Tensor]], ninputs: CInt, outputs: Ptr[TF_Output], output_values: Ptr[Ptr[TF_Tensor]], noutputs: CInt, target_opers: Ptr[Ptr[TF_Operation]], ntargets: CInt, p1: Ptr[TF_Status]): Unit = extern
  def TF_DeletePRunHandle(handle: CString): Unit = extern
  def TF_NewDeprecatedSession(p0: Ptr[TF_SessionOptions], status: Ptr[TF_Status]): Ptr[TF_DeprecatedSession] = extern
  def TF_CloseDeprecatedSession(p0: Ptr[TF_DeprecatedSession], status: Ptr[TF_Status]): Unit = extern
  def TF_DeleteDeprecatedSession(p0: Ptr[TF_DeprecatedSession], status: Ptr[TF_Status]): Unit = extern
  def TF_Reset(opt: Ptr[TF_SessionOptions], containers: Ptr[CString], ncontainers: CInt, status: Ptr[TF_Status]): Unit = extern
  def TF_ExtendGraph(p0: Ptr[TF_DeprecatedSession], proto: Ptr[Byte], proto_len: CSize, p1: Ptr[TF_Status]): Unit = extern
  def TF_Run(p0: Ptr[TF_DeprecatedSession], run_options: Ptr[TF_Buffer], input_names: Ptr[CString], inputs: Ptr[Ptr[TF_Tensor]], ninputs: CInt, output_names: Ptr[CString], outputs: Ptr[Ptr[TF_Tensor]], noutputs: CInt, target_oper_names: Ptr[CString], ntargets: CInt, run_metadata: Ptr[TF_Buffer], p1: Ptr[TF_Status]): Unit = extern
  def TF_PRunSetup(p0: Ptr[TF_DeprecatedSession], input_names: Ptr[CString], ninputs: CInt, output_names: Ptr[CString], noutputs: CInt, target_oper_names: Ptr[CString], ntargets: CInt, handle: Ptr[CString], p1: Ptr[TF_Status]): Unit = extern
  def TF_PRun(p0: Ptr[TF_DeprecatedSession], handle: CString, input_names: Ptr[CString], inputs: Ptr[Ptr[TF_Tensor]], ninputs: CInt, output_names: Ptr[CString], outputs: Ptr[Ptr[TF_Tensor]], noutputs: CInt, target_oper_names: Ptr[CString], ntargets: CInt, p1: Ptr[TF_Status]): Unit = extern
  def TF_SessionListDevices(session: Ptr[TF_Session], status: Ptr[TF_Status]): Ptr[TF_DeviceList] = extern
  def TF_DeprecatedSessionListDevices(session: Ptr[TF_DeprecatedSession], status: Ptr[TF_Status]): Ptr[TF_DeviceList] = extern
  def TF_DeleteDeviceList(list: Ptr[TF_DeviceList]): Unit = extern
  def TF_DeviceListCount(list: Ptr[TF_DeviceList]): CInt = extern
  def TF_DeviceListName(list: Ptr[TF_DeviceList], index: CInt, status: Ptr[TF_Status]): CString = extern
  def TF_DeviceListType(list: Ptr[TF_DeviceList], index: CInt, status: Ptr[TF_Status]): CString = extern
  def TF_DeviceListMemoryBytes(list: Ptr[TF_DeviceList], index: CInt, status: Ptr[TF_Status]): CLongInt = extern
  def TF_DeviceListIncarnation(list: Ptr[TF_DeviceList], index: CInt, status: Ptr[TF_Status]): CLongInt = extern
  def TF_LoadLibrary(library_filename: CString, status: Ptr[TF_Status]): Ptr[TF_Library] = extern
  def TF_DeleteLibraryHandle(lib_handle: Ptr[TF_Library]): Unit = extern
  def TF_GetAllOpList(): Ptr[TF_Buffer] = extern
  def TF_NewApiDefMap(op_list_buffer: Ptr[TF_Buffer], status: Ptr[TF_Status]): Ptr[TF_ApiDefMap] = extern
  def TF_DeleteApiDefMap(apimap: Ptr[TF_ApiDefMap]): Unit = extern
  def TF_ApiDefMapPut(api_def_map: Ptr[TF_ApiDefMap], text: CString, text_len: CSize, status: Ptr[TF_Status]): Unit = extern
  def TF_ApiDefMapGet(api_def_map: Ptr[TF_ApiDefMap], name: CString, name_len: CSize, status: Ptr[TF_Status]): Ptr[TF_Buffer] = extern
  def TF_GetAllRegisteredKernels(status: Ptr[TF_Status]): Ptr[TF_Buffer] = extern
  def TF_GetRegisteredKernelsForOp(name: CString, status: Ptr[TF_Status]): Ptr[TF_Buffer] = extern
  def TF_NewServer(proto: Ptr[Byte], proto_len: CSize, status: Ptr[TF_Status]): Ptr[TF_Server] = extern
  def TF_ServerStart(server: Ptr[TF_Server], status: Ptr[TF_Status]): Unit = extern
  def TF_ServerStop(server: Ptr[TF_Server], status: Ptr[TF_Status]): Unit = extern
  def TF_ServerJoin(server: Ptr[TF_Server], status: Ptr[TF_Status]): Unit = extern
  def TF_ServerTarget(server: Ptr[TF_Server]): CString = extern
  def TF_DeleteServer(server: Ptr[TF_Server]): Unit = extern
  def TF_RegisterLogListener(listener: CFunctionPtr1[CString, Unit]): Unit = extern

  object implicits {
    implicit class TF_Buffer_Ops(val p: Ptr[TF_Buffer]) extends AnyVal {
      def data: Ptr[Byte] = !p.asInstanceOf[Ptr[struct_TF_Buffer]]._1
      def data_=(value: Ptr[Byte]): Unit = !p.asInstanceOf[Ptr[struct_TF_Buffer]]._1 = value
      def length: CSize = !p.asInstanceOf[Ptr[struct_TF_Buffer]]._2
      def length_=(value: CSize): Unit = !p.asInstanceOf[Ptr[struct_TF_Buffer]]._2 = value
      def data_deallocator: CFunctionPtr2[Ptr[Byte], CSize, Unit] = !p.asInstanceOf[Ptr[struct_TF_Buffer]]._3
      def data_deallocator_=(value: CFunctionPtr2[Ptr[Byte], CSize, Unit]): Unit = !p.asInstanceOf[Ptr[struct_TF_Buffer]]._3 = value
    }

    implicit class TF_Input_Ops(val p: Ptr[TF_Input]) extends AnyVal {
      def oper: Ptr[TF_Operation] = !p.asInstanceOf[Ptr[struct_TF_Input]]._1
      def oper_=(value: Ptr[TF_Operation]): Unit = !p.asInstanceOf[Ptr[struct_TF_Input]]._1 = value
      def index: CInt = !p.asInstanceOf[Ptr[struct_TF_Input]]._2
      def index_=(value: CInt): Unit = !p.asInstanceOf[Ptr[struct_TF_Input]]._2 = value
    }

    implicit class TF_Output_Ops(val p: Ptr[TF_Output]) extends AnyVal {
      def oper: Ptr[TF_Operation] = !p.asInstanceOf[Ptr[struct_TF_Output]]._1
      def oper_=(value: Ptr[TF_Operation]): Unit = !p.asInstanceOf[Ptr[struct_TF_Output]]._1 = value
      def index: CInt = !p.asInstanceOf[Ptr[struct_TF_Output]]._2
      def index_=(value: CInt): Unit = !p.asInstanceOf[Ptr[struct_TF_Output]]._2 = value
    }

    implicit class TF_AttrMetadata_Ops(val p: Ptr[TF_AttrMetadata]) extends AnyVal {
      def is_list: CUnsignedChar = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._1
      def is_list_=(value: CUnsignedChar): Unit = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._1 = value
      def list_size: CLongInt = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._2
      def list_size_=(value: CLongInt): Unit = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._2 = value
      def `type`: TF_AttrType = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._3
      def `type_=`(value: TF_AttrType): Unit = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._3 = value
      def total_size: CLongInt = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._4
      def total_size_=(value: CLongInt): Unit = !p.asInstanceOf[Ptr[struct_TF_AttrMetadata]]._4 = value
    }

    implicit class TF_WhileParams_Ops(val p: Ptr[TF_WhileParams]) extends AnyVal {
      def ninputs: CInt = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._1
      def ninputs_=(value: CInt): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._1 = value
      def cond_graph: Ptr[TF_Graph] = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._2
      def cond_graph_=(value: Ptr[TF_Graph]): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._2 = value
      def cond_inputs: Ptr[TF_Output] = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._3
      def cond_inputs_=(value: Ptr[TF_Output]): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._3 = value
      def cond_output: Ptr[TF_Output] = p.asInstanceOf[Ptr[struct_TF_WhileParams]]._4
      def cond_output_=(value: Ptr[TF_Output]): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._4 = !value
      def body_graph: Ptr[TF_Graph] = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._5
      def body_graph_=(value: Ptr[TF_Graph]): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._5 = value
      def body_inputs: Ptr[TF_Output] = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._6
      def body_inputs_=(value: Ptr[TF_Output]): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._6 = value
      def body_outputs: Ptr[TF_Output] = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._7
      def body_outputs_=(value: Ptr[TF_Output]): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._7 = value
      def name: CString = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._8
      def name_=(value: CString): Unit = !p.asInstanceOf[Ptr[struct_TF_WhileParams]]._8 = value
    }

    implicit class TF_Graph_Ops(val p: Ptr[TF_Graph]) extends AnyVal {

    }
  }

  object TF_Buffer {
    import implicits._
    def apply()(implicit z: Zone): Ptr[TF_Buffer] = alloc[TF_Buffer]
    def apply(data: Ptr[Byte], length: CSize, data_deallocator: CFunctionPtr2[Ptr[Byte], CSize, Unit])(implicit z: Zone): Ptr[TF_Buffer] = {
      val ptr = alloc[TF_Buffer]
      ptr.data = data
      ptr.length = length
      ptr.data_deallocator = data_deallocator
      ptr
    }
  }

  object TF_Input {
    import implicits._
    def apply()(implicit z: Zone): Ptr[TF_Input] = alloc[TF_Input]
    def apply(oper: Ptr[TF_Operation], index: CInt)(implicit z: Zone): Ptr[TF_Input] = {
      val ptr = alloc[TF_Input]
      ptr.oper = oper
      ptr.index = index
      ptr
    }
  }

  object TF_Output {
    import implicits._
    def apply()(implicit z: Zone): Ptr[TF_Output] = alloc[TF_Output]
    def apply(oper: Ptr[TF_Operation], index: CInt)(implicit z: Zone): Ptr[TF_Output] = {
      val ptr = alloc[TF_Output]
      ptr.oper = oper
      ptr.index = index
      ptr
    }
  }

  object TF_AttrMetadata {
    import implicits._
    def apply()(implicit z: Zone): Ptr[TF_AttrMetadata] = alloc[TF_AttrMetadata]
    def apply(is_list: CUnsignedChar, list_size: CLongInt, `type`: TF_AttrType, total_size: CLongInt)(implicit z: Zone): Ptr[TF_AttrMetadata] = {
      val ptr = alloc[TF_AttrMetadata]
      ptr.is_list = is_list
      ptr.list_size = list_size
      ptr.`type` = `type`
      ptr.total_size = total_size
      ptr
    }
  }

  object TF_WhileParams {
    import implicits._
    def apply()(implicit z: Zone): Ptr[TF_WhileParams] = alloc[TF_WhileParams]
    def apply(ninputs: CInt, cond_graph: Ptr[TF_Graph], cond_inputs: Ptr[TF_Output], cond_output: Ptr[TF_Output], body_graph: Ptr[TF_Graph], body_inputs: Ptr[TF_Output], body_outputs: Ptr[TF_Output], name: CString)(implicit z: Zone): Ptr[TF_WhileParams] = {
      val ptr = alloc[TF_WhileParams]
      ptr.ninputs = ninputs
      ptr.cond_graph = cond_graph
      ptr.cond_inputs = cond_inputs
      ptr.cond_output = cond_output
      ptr.body_graph = body_graph
      ptr.body_inputs = body_inputs
      ptr.body_outputs = body_outputs
      ptr.name = name
      ptr
    }
  }
}
