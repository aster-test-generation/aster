# Automatically generated by Pynguin.
import ansible.utils.unsafe_proxy as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'test_bytes: {0} : {1} : {2}'
    set_0 = None
    int_0 = -3189
    native_jinja_unsafe_text_0 = module_0.NativeJinjaUnsafeText()
    list_0 = [set_0, set_0, str_0, int_0]
    unsafe_proxy_0 = module_0.UnsafeProxy(*list_0)

def test_case_2():
    str_0 = '}tI-v]Ug>x'
    list_0 = [str_0, str_0]
    var_0 = module_0.wrap_var(list_0)

def test_case_3():
    str_0 = '%prog [options] playbook.yml [playbook2 ...]'
    var_0 = module_0.wrap_var(str_0)

def test_case_4():
    str_0 = 'test_bytes: {0} : {1} : {2}'
    set_0 = None
    int_0 = 2321
    native_jinja_unsafe_text_0 = module_0.NativeJinjaUnsafeText()
    list_0 = [set_0, set_0, str_0, int_0]
    unsafe_proxy_0 = module_0.UnsafeProxy(*list_0)
    dict_0 = {}
    list_1 = [dict_0]
    var_0 = module_0.to_unsafe_bytes(*list_1, **dict_0)

def test_case_5():
    ansible_unsafe_text_0 = module_0.AnsibleUnsafeText()
    list_0 = [ansible_unsafe_text_0]
    var_0 = module_0.wrap_var(list_0)
    ansible_unsafe_0 = module_0.AnsibleUnsafe()
    str_0 = 'O\x0c'
    var_1 = module_0.wrap_var(str_0)
    var_2 = module_0.wrap_var(ansible_unsafe_0)
    ansible_unsafe_text_1 = module_0.AnsibleUnsafeText(*list_0)
    var_3 = ansible_unsafe_text_0.encode()
    str_1 = 'fullclone'
    str_2 = 'zy*E8>Q=]hz:U>7kLk'
    set_0 = {ansible_unsafe_text_1, str_0}
    dict_0 = {str_1: ansible_unsafe_text_1, str_2: ansible_unsafe_text_1, str_2: set_0}
    var_4 = module_0.wrap_var(dict_0)
    var_5 = ansible_unsafe_text_1.encode()
    ansible_unsafe_text_2 = module_0.AnsibleUnsafeText()
    str_3 = 'spec'
    dict_1 = {str_3: var_4, str_1: ansible_unsafe_text_2, str_0: ansible_unsafe_text_2}
    unsafe_proxy_0 = module_0.UnsafeProxy(*list_0, **dict_1)