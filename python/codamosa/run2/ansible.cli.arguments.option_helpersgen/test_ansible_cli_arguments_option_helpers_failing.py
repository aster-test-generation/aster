# Automatically generated by Pynguin.
import ansible.cli.arguments.option_helpers as module_0
import argparse as module_1

def test_case_0():
    try:
        bool_0 = False
        bool_1 = False
        sorting_help_formatter_0 = module_0.SortingHelpFormatter(bool_1)
        var_0 = sorting_help_formatter_0.add_arguments(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 612
        float_0 = -2664.4
        ansible_version_0 = None
        unrecognized_argument_0 = module_0.UnrecognizedArgument(int_0, float_0, ansible_version_0)
        float_1 = -2140.43
        var_0 = module_0.add_runas_prompt_options(float_1)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = "9WA-^;z>#5Q'~`\\ T"
        set_0 = {str_0, str_0, str_0}
        bool_0 = False
        list_0 = [str_0, bool_0, str_0]
        prepend_list_action_0 = module_0.PrependListAction(list_0, str_0)
        ansible_version_0 = module_0.AnsibleVersion(str_0, set_0, bool_0, bool_0, prepend_list_action_0)
        var_0 = module_0.add_verbosity_options(ansible_version_0)
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = None
        str_0 = 'xX4"b\';'
        float_0 = 0.0
        set_0 = {str_0, float_0}
        str_1 = 'b'
        float_1 = 1.5
        ansible_version_0 = module_0.AnsibleVersion(set_0, str_1, int_0, str_0, float_1)
        bool_0 = False
        bytes_0 = b'\xf8*\xfcD\xd1\xa5\xc3\xa2\xef\xe4\x8e\xdf\xbb\xd5!\xc5'
        prepend_list_action_0 = module_0.PrependListAction(ansible_version_0, bool_0, str_0, bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        var_0 = module_0.version()
        bytes_0 = b'\x82\x9aG'
        var_1 = module_0.add_connect_options(bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        var_0 = module_0.version()
        bool_0 = True
        var_1 = module_0.add_fork_options(bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        int_0 = 225
        list_0 = [int_0]
        var_0 = module_0.add_inventory_options(list_0)
    except BaseException:
        pass

def test_case_7():
    try:
        unrecognized_argument_0 = None
        set_0 = {unrecognized_argument_0, unrecognized_argument_0, unrecognized_argument_0, unrecognized_argument_0}
        bool_0 = True
        int_0 = 653
        str_0 = 'R}V\tWbe%V_M+v'
        ansible_version_0 = module_0.AnsibleVersion(bool_0, unrecognized_argument_0, int_0, str_0)
        list_0 = [set_0, ansible_version_0, unrecognized_argument_0]
        var_0 = module_0.add_module_options(list_0)
    except BaseException:
        pass

def test_case_8():
    try:
        float_0 = -1964.36
        var_0 = module_0.add_output_options(float_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bytes_0 = b'Z\x8e, NKC'
        var_0 = module_0.add_runas_options(bytes_0)
    except BaseException:
        pass

def test_case_10():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        str_0 = 'QRH+)k/"Ub'
        str_1 = '.ojRIyE:uB.'
        str_2 = 'MEOX+bk]a.fY6\x0c+'
        dict_0 = {str_1: str_1, str_2: str_1, str_1: str_0}
        bool_0 = False
        tuple_0 = (list_0, bool_0)
        var_1 = module_0.add_runas_prompt_options(dict_0, tuple_0)
    except BaseException:
        pass

def test_case_11():
    try:
        bytes_0 = b'+x\xa0p\xbe\xec5]W\xec\xc9\xd5\x14\x0f\xf6'
        str_0 = 'd~+'
        bool_0 = True
        tuple_0 = None
        set_0 = None
        int_0 = -3522
        unrecognized_argument_0 = module_0.UnrecognizedArgument(bool_0, tuple_0, set_0, int_0)
        bool_1 = False
        prepend_list_action_0 = module_0.PrependListAction(bytes_0, str_0, unrecognized_argument_0, tuple_0, bool_1)
        dict_0 = {prepend_list_action_0: bool_0, bool_1: tuple_0, unrecognized_argument_0: bool_1, set_0: bool_0}
        var_0 = module_0.add_runtask_options(dict_0)
    except BaseException:
        pass

def test_case_12():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        str_0 = 'Un$known argument'
        list_1 = [list_0, list_0, list_0, str_0]
        float_0 = 2215.678
        str_1 = '7zza4r@,?fbc2f'
        ansible_version_0 = module_0.AnsibleVersion(list_1, float_0, str_1)
        prepend_list_action_0 = module_0.PrependListAction(list_0, str_0, ansible_version_0)
        bytes_0 = b'\xe1YJ\xd6\x98\x85\xcb\x19\x16'
        tuple_0 = ()
        int_0 = -61
        int_1 = 299
        var_1 = ansible_version_0.__call__(bytes_0, tuple_0, int_0, int_1)
    except BaseException:
        pass

def test_case_13():
    try:
        int_0 = 1116
        var_0 = module_0.version(int_0)
        list_0 = [var_0]
        str_0 = ',q_js$,uO#G6a^k'
        list_1 = [list_0, list_0, list_0, str_0]
        float_0 = 2215.678
        ansible_version_0 = module_0.AnsibleVersion(list_1, float_0, str_0)
        prepend_list_action_0 = module_0.PrependListAction(list_0, str_0, ansible_version_0)
        str_1 = '"+X) ->2cK~KW'
        dict_0 = {str_1: str_0, prepend_list_action_0: str_1}
        int_1 = -479
        var_1 = prepend_list_action_0.__call__(dict_0, str_0, int_1)
    except BaseException:
        pass

def test_case_14():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        float_0 = 2214.5808772580526
        str_0 = 'jhQ Mcn0,zOI/G]Cb,'
        ansible_version_0 = module_0.AnsibleVersion(list_0, float_0, str_0)
        prepend_list_action_0 = module_0.PrependListAction(list_0, str_0, ansible_version_0)
        int_0 = 3911
        unrecognized_argument_0 = module_0.UnrecognizedArgument(float_0, prepend_list_action_0)
        var_1 = prepend_list_action_0.__call__(int_0, list_0, unrecognized_argument_0)
    except BaseException:
        pass

def test_case_15():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        str_0 = 'QRH+)k/"Ub'
        float_0 = 2215.678
        str_1 = 'jhQ Mcn0,zOI/G]Cb,'
        ansible_version_0 = module_0.AnsibleVersion(list_0, float_0, str_1)
        prepend_list_action_0 = module_0.PrependListAction(list_0, str_0, ansible_version_0)
        int_0 = 3911
        float_1 = 307.0
        tuple_0 = ()
        var_1 = module_0.create_base_parser(tuple_0)
        bool_0 = True
        bytes_0 = None
        argument_parser_0 = module_1.ArgumentParser(bool_0, bytes_0)
        var_2 = module_0.add_vault_options(argument_parser_0)
        unrecognized_argument_0 = module_0.UnrecognizedArgument(float_1, prepend_list_action_0)
        dict_0 = None
        sorting_help_formatter_0 = module_0.SortingHelpFormatter(int_0, dict_0, tuple_0)
    except BaseException:
        pass

def test_case_16():
    try:
        bool_0 = False
        prepend_list_action_0 = None
        tuple_0 = None
        set_0 = {prepend_list_action_0}
        float_0 = -2848.0
        unrecognized_argument_0 = module_0.UnrecognizedArgument(tuple_0, set_0, float_0)
        unrecognized_argument_1 = module_0.UnrecognizedArgument(bool_0, prepend_list_action_0, unrecognized_argument_0)
        list_0 = [set_0]
        str_0 = 'xKJ}\x0c'
        bytes_0 = b'v\xbb\n'
        var_0 = unrecognized_argument_0.__call__(list_0, str_0, bytes_0, prepend_list_action_0)
    except BaseException:
        pass

def test_case_17():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        unrecognized_argument_0 = module_0.UnrecognizedArgument(list_0, list_0)
        bool_0 = True
        bool_1 = False
        bytes_0 = b'\x88\xa5\x01R\t\xcb;\x15\x91'
        prepend_list_action_0 = module_0.PrependListAction(unrecognized_argument_0, bool_0, bool_1, bytes_0)
    except BaseException:
        pass

def test_case_18():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        str_0 = 'QRH+)k/"Ub'
        list_1 = [list_0, list_0, list_0, str_0]
        float_0 = 2215.678
        str_1 = '7zza4r@,?fbc2f'
        ansible_version_0 = module_0.AnsibleVersion(list_1, float_0, str_1)
        int_0 = 0
        sorting_help_formatter_0 = module_0.SortingHelpFormatter(int_0)
        var_1 = module_0.add_module_options(sorting_help_formatter_0)
    except BaseException:
        pass

def test_case_19():
    try:
        unrecognized_argument_0 = None
        sorting_help_formatter_0 = module_0.SortingHelpFormatter(unrecognized_argument_0)
        var_0 = module_0.add_inventory_options(sorting_help_formatter_0)
    except BaseException:
        pass

def test_case_20():
    try:
        str_0 = 'Test options added by add_runas_options()'
        str_1 = 'test'
        str_2 = 'Test privilege escalation options'
        var_0 = module_0.create_base_parser(str_1, str_2)
        var_1 = module_0.add_runas_options(var_0)
        str_3 = 'b'
        bool_0 = False
        str_4 = 'store_true'
        var_2 = (bool_0, bool_0, str_4)
        var_3 = (str_3, var_2)
        str_5 = '--bScome'
        var_4 = (bool_0, bool_0, str_4)
        var_5 = (str_5, var_4)
        str_6 = '--become-method'
        str_7 = 'value'
        str_8 = 'store'
        var_6 = (bool_0, str_7, str_8)
        var_7 = (str_6, var_6)
        str_9 = '--become-user'
        var_8 = (bool_0, str_7, str_8)
        var_9 = (str_9, var_8)
        var_10 = (var_3, var_5, var_7, var_9)
        var_11 = len(var_10)
        var_12 = str_0.option_strings
    except BaseException:
        pass

def test_case_21():
    try:
        str_0 = '%s ls-remote %s -h refs/heads/%s'
        list_0 = [str_0, str_0, str_0]
        bool_0 = False
        sorting_help_formatter_0 = module_0.SortingHelpFormatter(list_0, bool_0)
        var_0 = module_0.add_fork_options(sorting_help_formatter_0)
    except BaseException:
        pass

def test_case_22():
    try:
        var_0 = module_0.version()
        list_0 = [var_0]
        bytes_0 = b'*\x1f\xbb\xc7\x96\xd8\xba\x97\x06\xd0'
        var_1 = module_0.create_base_parser(bytes_0)
        str_0 = 'QRH+)k/"Ub'
        float_0 = 2208.792776730666
        str_1 = 'jhQ Mcn0,zOI/G]Cb,'
        ansible_version_0 = module_0.AnsibleVersion(list_0, float_0, str_1)
        prepend_list_action_0 = module_0.PrependListAction(list_0, str_0, ansible_version_0)
        int_0 = 3911
        tuple_0 = ()
        var_2 = module_0.unfrack_path()
        namespace_0 = module_1.Namespace()
        dict_0 = {prepend_list_action_0: namespace_0, ansible_version_0: str_1}
        var_3 = prepend_list_action_0.__call__(tuple_0, namespace_0, dict_0)
        str_2 = '~%'
        bool_0 = False
        dict_1 = {str_0: int_0}
        argument_parser_0 = module_1.ArgumentParser(tuple_0, bool_0, list_0, dict_1)
        unrecognized_argument_0 = module_0.UnrecognizedArgument(str_2, ansible_version_0, int_0, tuple_0, argument_parser_0)
        str_3 = 'S2sF5lg\\&)@'
        float_1 = 737.1364293923634
        str_4 = '$b_.+xdu'
        str_5 = 'B!)066zvD?\\7q\\<0%'
        var_4 = module_0.version()
        argument_parser_1 = module_1.ArgumentParser(float_1, str_4, prepend_list_action_0, str_5)
        sorting_help_formatter_0 = None
        list_1 = [str_0, unrecognized_argument_0, str_3]
        bool_1 = False
        action_0 = module_1.Action(unrecognized_argument_0, argument_parser_1, dict_1, dict_1, bool_1)
        str_6 = '?'
        prepend_list_action_1 = module_0.PrependListAction(tuple_0, list_1, str_6, int_0, bytes_0)
        str_7 = "AZS'pT\x0c\x0c\n9h"
        var_5 = prepend_list_action_0.__call__(str_7, action_0, sorting_help_formatter_0, action_0)
    except BaseException:
        pass

def test_case_23():
    try:
        str_0 = '0ticnAGA=v{n'
        sorting_help_formatter_0 = module_0.SortingHelpFormatter(str_0)
        tuple_0 = ()
        list_0 = [tuple_0, tuple_0, tuple_0]
        dict_0 = {}
        namespace_0 = module_1.Namespace()
        sorting_help_formatter_1 = module_0.SortingHelpFormatter(namespace_0)
        var_0 = sorting_help_formatter_1.add_arguments(dict_0)
        var_1 = module_0.add_inventory_options(list_0)
    except BaseException:
        pass