# Automatically generated by Pynguin.
import ansible.playbook.role.requirement as module_0

def test_case_0():
    role_requirement_0 = module_0.RoleRequirement()

def test_case_1():
    role_requirement_0 = module_0.RoleRequirement()
    set_0 = set()
    var_0 = role_requirement_0.repo_url_to_role_name(set_0)

def test_case_2():
    role_requirement_0 = module_0.RoleRequirement()
    dict_0 = {}
    var_0 = role_requirement_0.role_yaml_parse(dict_0)

def test_case_3():
    str_0 = '{n'
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.role_yaml_parse(str_0)

def test_case_4():
    str_0 = 'src'
    str_1 = 'https:/tgithub.com/ansible/ansible/pull/1234'
    str_2 = {str_1: str_1, str_1: str_0, str_0: str_1, str_1: str_1}
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.role_yaml_parse(str_2)

def test_case_5():
    str_0 = ';\\@o\x0bPrv"aoB\n:;y0JT'
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.repo_url_to_role_name(str_0)

def test_case_6():
    role_requirement_0 = module_0.RoleRequirement()
    str_0 = '.'
    var_0 = role_requirement_0.role_yaml_parse(str_0)
    str_1 = 'pdQIPXx\x0bsi)@b>Be.8x'
    var_1 = role_requirement_0.role_yaml_parse(str_1)
    str_2 = 'L\\(([^)]+),\\s+([^)]+)\\)'
    var_2 = role_requirement_0.role_yaml_parse(str_2)
    var_3 = role_requirement_0.role_yaml_parse(var_0)
    role_requirement_1 = module_0.RoleRequirement()
    role_requirement_2 = module_0.RoleRequirement()
    role_requirement_3 = module_0.RoleRequirement()
    var_4 = role_requirement_0.role_yaml_parse(str_0)

def test_case_7():
    str_0 = 'geerlingguy.redis,3.0.1'
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.role_yaml_parse(str_0)

def test_case_8():
    role_requirement_0 = module_0.RoleRequirement()
    role_requirement_1 = module_0.RoleRequirement()
    role_requirement_2 = module_0.RoleRequirement()
    str_0 = 'name1,src1,1.2.3'
    role_requirement_3 = module_0.RoleRequirement()
    var_0 = role_requirement_3.role_yaml_parse(str_0)

def test_case_9():
    role_requirement_0 = module_0.RoleRequirement()
    str_0 = '<'
    var_0 = role_requirement_0.role_yaml_parse(str_0)
    var_1 = role_requirement_0.role_yaml_parse(var_0)

def test_case_10():
    str_0 = ':SHYb/KciV~2|QF |'
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.role_yaml_parse(str_0)
    role_requirement_1 = module_0.RoleRequirement()
    role_requirement_2 = module_0.RoleRequirement()
    str_1 = '.'
    var_1 = role_requirement_0.role_yaml_parse(str_1)
    str_2 = 'pdQIPXx\x0bsi)@b>Be.8x'
    role_requirement_3 = module_0.RoleRequirement()
    var_2 = role_requirement_1.role_yaml_parse(str_2)
    str_3 = 'Do*e in kidLB.'
    dict_0 = {role_requirement_1: str_2, str_2: str_3, str_2: role_requirement_3}
    var_3 = role_requirement_0.role_yaml_parse(dict_0)
    var_4 = role_requirement_2.role_yaml_parse(var_1)
    role_requirement_4 = module_0.RoleRequirement()
    role_requirement_5 = module_0.RoleRequirement()
    var_5 = role_requirement_2.role_yaml_parse(str_1)
    int_0 = 2357
    role_requirement_6 = module_0.RoleRequirement()
    dict_1 = {int_0: str_2}
    var_6 = role_requirement_4.repo_url_to_role_name(dict_1)
    str_4 = '@X*8NDUsh\\Wyv,hS1YW'
    var_7 = role_requirement_2.repo_url_to_role_name(str_4)

def test_case_11():
    str_0 = 'https://github.com/ansiblW/ansi_le/pull/1234'
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.role_yaml_parse(str_0)

def test_case_12():
    str_0 = 'src'
    str_1 = 'https://github.com/ansiblW/ansi_le/pull/1234'
    str_2 = {str_0: str_1, str_0: str_1}
    role_requirement_0 = module_0.RoleRequirement()
    var_0 = role_requirement_0.role_yaml_parse(str_2)

def test_case_13():
    str_0 = 'J'
    str_1 = 'src'
    str_2 = 'https://github.comnansible/ansible/+ull/1234'
    str_3 = {str_0: str_2, str_1: str_2}
    role_requirement_0 = module_0.RoleRequirement()
    role_requirement_1 = module_0.RoleRequirement()
    var_0 = role_requirement_1.role_yaml_parse(str_3)

def test_case_14():
    str_0 = 'src'
    role_requirement_0 = module_0.RoleRequirement()
    role_requirement_1 = module_0.RoleRequirement()
    str_1 = 'testrole'
    str_2 = "9p\x0b;@gD6;/j'<wwt)F@x"
    var_0 = role_requirement_1.repo_url_to_role_name(str_2)
    str_3 = 'hxtp;://github.com/ansbl/ansible/pull/1234'
    str_4 = {str_0: str_1, str_0: str_3}
    role_requirement_2 = module_0.RoleRequirement()
    var_1 = role_requirement_2.role_yaml_parse(str_4)