# Automatically generated by Pynguin.
import ansible.utils.jsonrpc as module_0

def test_case_0():
    pass

def test_case_1():
    json_rpc_server_0 = module_0.JsonRpcServer()
    str_0 = '{ "jsonrpc": "2.0", "method": ">etInfo", "params": [1,23], "id": 5 }'
    var_0 = json_rpc_server_0.handle_request(str_0)

def test_case_2():
    json_rpc_server_0 = module_0.JsonRpcServer()
    var_0 = json_rpc_server_0.register(json_rpc_server_0)
    str_0 = '{"jsonrpc": "2.0", "method": "response", "params": [[1, 2, 3], {"a": "A", "b": "B", "c": "C"}], "id": 1}'
    var_1 = json_rpc_server_0.handle_request(str_0)

def test_case_3():
    json_rpc_server_0 = module_0.JsonRpcServer()
    str_0 = '{"jsonrpc": "2.0", "method": "response", "params": [[1, 2, 3], {"a": "A", "b": "B", "c": "C"}], "id": 1}'
    var_0 = json_rpc_server_0.handle_request(str_0)

def test_case_4():
    json_rpc_server_0 = module_0.JsonRpcServer()
    str_0 = '_identifier'
    int_0 = 1
    var_0 = setattr(json_rpc_server_0, str_0, int_0)
    var_1 = json_rpc_server_0.response()

def test_case_5():
    int_0 = 1234
    str_0 = 'test'
    json_rpc_server_0 = module_0.JsonRpcServer()
    str_1 = '_identifier'
    var_0 = setattr(json_rpc_server_0, str_1, int_0)
    var_1 = json_rpc_server_0.response(str_0)