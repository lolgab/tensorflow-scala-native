#include <tensorflow/c/c_api.h>

void scalanative_TF_GraphSetTensorShape(TF_Graph* graph,
                                        TF_Output* output,
                                        const int64_t* dims,
                                        const int num_dims,
                                        TF_Status* status) {
  TF_GraphSetTensorShape(graph, *output, dims, num_dims, status);
}

int scalanative_TF_GraphGetTensorNumDims(TF_Graph* graph,
                                          TF_Output* output,
                                          TF_Status* status) {
  return TF_GraphGetTensorNumDims(graph, *output, status);
}

void scalanative_TF_GraphGetTensorShape(TF_Graph* graph,
                                        TF_Output* output,
                                        int64_t* dims,
                                        int num_dims,
                                        TF_Status* status) {
  TF_GraphGetTensorShape(graph, *output, dims, num_dims, status);
}

void scalanative_TF_AddInput(TF_OperationDescription* desc,
                             TF_Output* input) {
  TF_AddInput(desc, *input);
}

TF_DataType* scalanative_TF_OperationOutputType(TF_Output* oper_out, TF_DataType* res) {
  *res = TF_OperationOutputType(*oper_out);
  return res;
}

TF_DataType* scalanative_TF_OperationInputType(TF_Input* oper_in, TF_DataType* res) {
  *res = TF_OperationInputType(*oper_in);
  return res;
}

TF_Output* scalanative_TF_OperationInput(TF_Input* oper_in, TF_Output* res) {
  *res = TF_OperationInput(*oper_in);
  return res;
}

int scalanative_TF_OperationOutputNumConsumers(TF_Output* oper_out) {
  return TF_OperationOutputNumConsumers(*oper_out);
}

void scalanative_TF_OperationOutputConsumers(TF_Output* oper_out,
                                             TF_Input* consumers,
                                             int max_consumers) {
  TF_OperationOutputConsumers(*oper_out, consumers, max_consumers);
}

TF_AttrMetadata* scalanative_TF_OperationGetAttrMetadata(TF_Operation* oper,
                                                         const char* attr_name,
                                                         TF_Status* status,
                                                         TF_AttrMetadata* res) {
  *res = TF_OperationGetAttrMetadata(oper, attr_name, status);
  return res;
}

void scalanative_TF_ImportGraphDefOptionsAddInputMapping(TF_ImportGraphDefOptions* opts,
                                                         const char* src_name,
                                                         int src_index,
                                                         TF_Output* dst) {
  TF_ImportGraphDefOptionsAddInputMapping(opts, src_name, src_index, *dst);
}

// TF_WhileParams* scalanative_TF_NewWhile(TF_Graph* g,
//                                         TF_Output* inputs,
//                                         int ninputs,
//                                         TF_Status* status,
//                                         TF_WhileParams* res) {
//   res* = TF_NewWhile(g, inputs, ninputs, status);
//   return res;
// }

unsigned char scalanative_TF_TryEvaluateConstant(TF_Graph* graph,
                                                 TF_Output* output,
                                                 TF_Tensor** result,
                                                 TF_Status* status) {
  return TF_TryEvaluateConstant(graph, *output, result, status);
}

TF_Buffer* scalanative_TF_GetOpList(TF_Library* lib_handle, TF_Buffer* res) {
  *res = TF_GetOpList(lib_handle);
  return res;
}