# Automatically generated by Pynguin.
import typesystem.base as module_0

def test_case_0():
    int_0 = -1149
    position_0 = module_0.Position(int_0, int_0, int_0)
    str_0 = position_0.__repr__()

def test_case_1():
    str_0 = '_ \r'
    int_0 = 3018
    position_0 = module_0.Position(int_0, int_0, int_0)
    message_0 = module_0.Message(text=str_0, key=str_0, position=position_0)
    str_1 = message_0.__repr__()

def test_case_2():
    str_0 = 'Forms do not support rendering Object fields'
    base_error_0 = module_0.BaseError(text=str_0, key=str_0)
    list_0 = base_error_0.messages()

def test_case_3():
    str_0 = 'Hello'
    parse_error_0 = module_0.ParseError(text=str_0)

def test_case_4():
    str_0 = 'example eode'
    message_0 = module_0.Message(text=str_0, code=str_0, key=str_0)
    bool_0 = message_0.__eq__(message_0)

def test_case_5():
    str_0 = 'S\n0+AIHfNR@\nyL 92-c'
    list_0 = []
    int_0 = 4
    int_1 = 2252
    position_0 = module_0.Position(int_0, int_1, int_0)
    message_0 = module_0.Message(text=str_0, index=list_0, end_position=position_0)
    int_2 = message_0.__hash__()

def test_case_6():
    str_0 = '#x+JCK5s-\x0bwkgAI|'
    list_0 = []
    bool_0 = True
    message_0 = module_0.Message(text=str_0, index=list_0, start_position=bool_0)
    str_1 = message_0.__repr__()

def test_case_7():
    int_0 = 2433
    int_1 = 1673
    position_0 = module_0.Position(int_0, int_0, int_1)
    bool_0 = position_0.__eq__(int_1)
    position_1 = module_0.Position(int_1, int_1, int_1)
    str_0 = position_1.__repr__()
    str_1 = 'A*'
    message_0 = module_0.Message(text=str_1)
    str_2 = message_0.__repr__()

def test_case_8():
    int_0 = -1149
    position_0 = module_0.Position(int_0, int_0, int_0)
    bool_0 = position_0.__eq__(position_0)
    str_0 = position_0.__repr__()
    base_error_0 = module_0.BaseError(text=str_0, position=position_0)
    list_0 = base_error_0.messages(add_prefix=int_0)

def test_case_9():
    str_0 = ';Qa~'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    int_0 = -722
    int_1 = None
    position_0 = module_0.Position(int_0, int_1, int_1)
    int_2 = 1296
    int_3 = 4
    position_1 = module_0.Position(int_2, int_3, int_3)
    message_0 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_0)
    str_1 = 'Items must be unique.'
    bool_0 = message_0.__eq__(message_0)
    message_1 = module_0.Message(text=str_1, code=str_1, key=int_0, end_position=position_0)
    list_0 = [message_0, message_0, message_1, message_1]
    base_error_0 = module_0.BaseError(messages=list_0)
    validation_result_1 = module_0.ValidationResult()
    validation_result_2 = module_0.ValidationResult()
    int_4 = base_error_0.__hash__()
    str_2 = message_0.__repr__()
    str_3 = base_error_0.__str__()
    bool_1 = base_error_0.__eq__(int_1)
    int_5 = base_error_0.__len__()
    str_4 = base_error_0.__repr__()
    str_5 = base_error_0.__repr__()
    validation_result_3 = module_0.ValidationResult()
    base_error_1 = module_0.BaseError(text=str_2, code=str_5, position=position_0)

def test_case_10():
    str_0 = 'error'
    validation_result_0 = module_0.ValidationResult(value=str_0)

def test_case_11():
    validation_result_0 = module_0.ValidationResult()
    str_0 = validation_result_0.__repr__()
    validation_result_1 = module_0.ValidationResult()

def test_case_12():
    bytes_0 = b'\xc9\xd9\x99I\x8e\x1ev)\xd4\x0b\x03?\xebur\xff=\x15\xe2'
    str_0 = 'qhvaeCRMu'
    message_0 = module_0.Message(text=str_0, code=str_0)
    int_0 = -1475
    int_1 = -269
    position_0 = module_0.Position(int_0, int_0, int_1)
    bool_0 = message_0.__eq__(bytes_0)
    bool_1 = message_0.__eq__(str_0)

def test_case_13():
    tuple_0 = ()
    int_0 = 540
    validation_result_0 = module_0.ValidationResult()
    str_0 = validation_result_0.__repr__()
    str_1 = 'Must be valid UUID format.'
    base_error_0 = module_0.BaseError(text=str_1)
    str_2 = "\t\\$9'a0TT?@W`$d|Mo!S"
    base_error_1 = module_0.BaseError(text=str_2, code=str_2)
    bool_0 = base_error_1.__eq__(tuple_0)
    str_3 = '4-vy\r'
    str_4 = 'R'
    int_1 = None
    int_2 = 817
    position_0 = module_0.Position(int_0, int_1, int_2)
    message_0 = module_0.Message(text=str_3, code=str_4, start_position=position_0)

def test_case_14():
    str_0 = ';Qa~'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    str_1 = validation_result_0.__repr__()
    int_0 = -722
    int_1 = None
    position_0 = module_0.Position(int_0, int_1, int_1)
    int_2 = 1296
    int_3 = 4
    position_1 = module_0.Position(int_2, int_3, int_3)
    str_2 = position_0.__repr__()
    message_0 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_0)
    str_3 = 'Items must be unique.'
    bool_0 = message_0.__eq__(message_0)
    message_1 = module_0.Message(text=str_3, code=str_3, key=int_0, end_position=position_0)
    list_0 = [message_0, message_0, message_1, message_1]
    base_error_0 = module_0.BaseError(messages=list_0)
    validation_result_1 = module_0.ValidationResult()
    validation_result_2 = module_0.ValidationResult()
    str_4 = message_0.__repr__()
    str_5 = base_error_0.__str__()
    bool_1 = base_error_0.__eq__(validation_result_0)
    int_4 = base_error_0.__len__()
    str_6 = base_error_0.__repr__()
    base_error_1 = module_0.BaseError(text=str_0)
    str_7 = base_error_1.__repr__()
    validation_result_3 = module_0.ValidationResult()
    bool_2 = validation_result_3.__bool__()
    list_1 = base_error_0.messages(add_prefix=str_7)

def test_case_15():
    str_0 = 'S{'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    int_0 = -708
    int_1 = None
    position_0 = module_0.Position(int_0, int_1, int_1)
    int_2 = 1296
    int_3 = 19
    position_1 = module_0.Position(int_2, int_3, int_3)
    message_0 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_0)
    str_1 = validation_result_0.__repr__()
    str_2 = 'Items must be nique.'
    bool_0 = message_0.__eq__(message_0)
    message_1 = module_0.Message(text=str_2, code=str_2, key=int_0, end_position=position_0)
    list_0 = [message_0, message_0, message_1, message_1]
    base_error_0 = module_0.BaseError(messages=list_0)
    bool_1 = validation_result_0.__bool__()
    int_4 = -1196
    str_3 = 'Imc$6SJ8A'
    parse_error_0 = module_0.ParseError(text=str_3, code=str_0)
    base_error_1 = module_0.BaseError(messages=list_0)
    str_4 = base_error_0.__str__()
    bool_2 = validation_result_0.__bool__()
    list_1 = base_error_0.messages(add_prefix=int_4)

def test_case_16():
    str_0 = ';Qa~'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    int_0 = -722
    int_1 = None
    position_0 = module_0.Position(int_0, int_1, int_1)
    int_2 = 4
    position_1 = module_0.Position(int_0, int_2, int_2)
    message_0 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_0)
    str_1 = 'Items must be unique.'
    bool_0 = message_0.__eq__(message_0)
    message_1 = module_0.Message(text=str_1, code=str_1, key=int_0, end_position=position_0)
    list_0 = [message_0, message_0, message_1, message_1]
    base_error_0 = module_0.BaseError(messages=list_0)
    validation_result_1 = module_0.ValidationResult()
    str_2 = position_0.__repr__()
    validation_result_2 = module_0.ValidationResult()
    str_3 = message_0.__repr__()
    str_4 = base_error_0.__str__()
    bool_1 = base_error_0.__eq__(int_1)
    int_3 = base_error_0.__len__()
    str_5 = base_error_0.__repr__()
    bool_2 = message_0.__eq__(message_1)
    str_6 = '%5n&<%48&ET|yt'
    base_error_1 = module_0.BaseError(text=str_6)
    list_1 = base_error_0.messages()

def test_case_17():
    str_0 = ';Qa~'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    int_0 = -722
    int_1 = None
    position_0 = module_0.Position(int_0, int_1, int_1)
    int_2 = 1296
    int_3 = 4
    position_1 = module_0.Position(int_2, int_3, int_3)
    message_0 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_0)
    str_1 = 'Items must be unique.'
    bool_0 = message_0.__eq__(message_0)
    message_1 = module_0.Message(text=str_1, code=str_1, key=int_0, end_position=position_0)
    list_0 = [message_0, message_0, message_1, message_1]
    base_error_0 = module_0.BaseError(messages=list_0)
    validation_result_1 = module_0.ValidationResult()
    str_2 = position_0.__repr__()
    str_3 = position_1.__repr__()
    validation_result_2 = module_0.ValidationResult()
    list_1 = [str_3]
    message_2 = module_0.Message(text=str_0, index=list_1, start_position=position_1, end_position=position_0)
    str_4 = message_2.__repr__()
    str_5 = base_error_0.__str__()
    bool_1 = base_error_0.__eq__(validation_result_1)
    int_4 = base_error_0.__len__()
    str_6 = base_error_0.__repr__()
    set_0 = set()
    bool_2 = message_1.__eq__(set_0)
    validation_error_0 = module_0.ValidationError(text=str_1)
    none_type_0 = None
    base_error_1 = module_0.BaseError(text=str_5, code=none_type_0)
    list_2 = base_error_0.messages()

def test_case_18():
    str_0 = ';Qa~'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    int_0 = -722
    int_1 = None
    position_0 = module_0.Position(int_0, int_1, int_1)
    int_2 = 1296
    int_3 = 4
    position_1 = module_0.Position(int_2, int_3, int_3)
    message_0 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_0)
    str_1 = 'Items must be unique.'
    bool_0 = message_0.__eq__(message_0)
    message_1 = module_0.Message(text=str_1, code=str_1, key=int_0, end_position=position_0)
    list_0 = [message_0, message_0, message_1, message_1]
    base_error_0 = module_0.BaseError(messages=list_0)
    validation_result_1 = module_0.ValidationResult()
    int_4 = -357
    int_5 = 957
    int_6 = -720
    position_2 = module_0.Position(int_4, int_5, int_6)
    str_2 = position_2.__repr__()
    validation_result_2 = module_0.ValidationResult(value=position_0)
    str_3 = message_1.__repr__()
    str_4 = base_error_0.__str__()
    validation_error_0 = module_0.ValidationError(text=str_3, key=int_3, position=position_2)
    bool_1 = base_error_0.__eq__(validation_error_0)
    int_7 = base_error_0.__len__()
    str_5 = base_error_0.__repr__()
    str_6 = base_error_0.__repr__()
    str_7 = base_error_0.__str__()
    validation_error_1 = None
    validation_result_3 = module_0.ValidationResult(value=list_0, error=validation_error_1)
    validation_result_4 = module_0.ValidationResult(error=validation_error_0)
    bool_2 = validation_result_4.__bool__()
    list_1 = base_error_0.messages()

def test_case_19():
    str_0 = ';Qa~'
    validation_result_0 = module_0.ValidationResult()
    optional_0 = None
    int_0 = -722
    int_1 = -1828
    position_0 = module_0.Position(int_0, int_1, int_0)
    message_0 = module_0.Message(text=str_0, code=str_0, end_position=position_0)
    bool_0 = message_0.__eq__(int_0)
    int_2 = None
    position_1 = module_0.Position(int_0, int_2, int_2)
    int_3 = 1296
    bool_1 = position_1.__eq__(position_0)
    int_4 = 4
    position_2 = module_0.Position(int_3, int_4, int_4)
    message_1 = module_0.Message(text=str_0, code=str_0, position=optional_0, start_position=position_1)
    bool_2 = message_1.__eq__(message_1)
    message_2 = module_0.Message(text=str_0, code=str_0, key=int_0, end_position=position_1)
    list_0 = [message_1, message_1, message_2, message_2]
    base_error_0 = module_0.BaseError(messages=list_0)
    validation_result_1 = module_0.ValidationResult()
    str_1 = position_1.__repr__()
    validation_result_2 = module_0.ValidationResult()
    str_2 = message_1.__repr__()
    str_3 = base_error_0.__str__()
    bool_3 = base_error_0.__eq__(message_2)
    int_5 = base_error_0.__len__()
    str_4 = base_error_0.__repr__()
    bool_4 = message_1.__eq__(bool_3)
    str_5 = base_error_0.__str__()
    validation_result_3 = module_0.ValidationResult()
    bool_5 = validation_result_3.__bool__()
    list_1 = base_error_0.messages()