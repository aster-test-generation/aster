# Automatically generated by Pynguin.
import pytutils.env as module_0

def test_case_0():
    try:
        int_0 = -4214
        ordered_dict_0 = module_0.load_env_file(int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'LOGGING'
        ordered_dict_0 = module_0.load_env_file(str_0)
        str_1 = 'V=RR '
        str_2 = module_0.expand(str_1)
        bytes_0 = b"\xcbE\x97U\xf6f\x82L\x9a\xc9\xfc\xfd\xc4\xb6='\xe5\x16\xc2"
        generator_0 = module_0.parse_env_file_contents(bytes_0)
        generator_1 = module_0.parse_env_file_contents()
        generator_2 = module_0.parse_env_file_contents()
        str_3 = module_0.expand(str_1)
        generator_3 = module_0.parse_env_file_contents()
        generator_4 = module_0.parse_env_file_contents()
        generator_5 = module_0.parse_env_file_contents()
        bool_0 = True
        int_0 = -11
        tuple_0 = (str_1, bool_0, int_0)
        str_4 = 'A lazy object that will replace itself in the appropriate scope.\n\n    This object sits, ready to create the real object the first time it is\n    needed.\n    '
        str_5 = module_0.expand(str_4)
        generator_6 = module_0.parse_env_file_contents()
        generator_7 = module_0.parse_env_file_contents()
        generator_8 = module_0.parse_env_file_contents()
        mutable_mapping_0 = None
        ordered_dict_1 = module_0.load_env_file(tuple_0, mutable_mapping_0)
    except BaseException:
        pass