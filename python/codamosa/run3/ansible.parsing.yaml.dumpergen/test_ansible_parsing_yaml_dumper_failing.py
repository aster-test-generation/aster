# Automatically generated by Pynguin.
import ansible.parsing.yaml.dumper as module_0
import ansible.template as module_1
import ansible.parsing.yaml.objects as module_2
import ansible.utils.unsafe_proxy as module_3
import ansible.vars.hostvars as module_4

def test_case_0():
    try:
        str_0 = 'LDOo'
        bytes_0 = None
        str_1 = 'h&1hxJ>'
        str_2 = '($-NQYP\r@SAEk"'
        ansible_dumper_0 = module_0.AnsibleDumper(str_0, bytes_0, str_1, str_2)
        ansible_undefined_0 = module_1.AnsibleUndefined(str_0, str_1)
        var_0 = ansible_dumper_0.represent_data(ansible_undefined_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = False
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        bytes_0 = b"\x0f;{/\xe6\xc1\xcb'q\xed\xd6?o"
        ansible_dumper_0 = module_0.AnsibleDumper(bool_0, list_0, bytes_0)
        bool_1 = True
        ansible_vault_encrypted_unicode_0 = module_2.AnsibleVaultEncryptedUnicode(list_0)
        var_0 = ansible_dumper_0.represent_data(ansible_vault_encrypted_unicode_0)
        ansible_dumper_1 = module_0.AnsibleDumper(ansible_dumper_0, bool_1, ansible_dumper_0, list_0)
        var_1 = module_0.represent_undefined(ansible_dumper_1)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        bytes_0 = b'\xd0\xf8'
        ansible_dumper_0 = module_0.AnsibleDumper(bool_0, list_0, bytes_0)
        list_1 = [bytes_0, bool_0]
        ansible_vault_encrypted_unicode_0 = module_2.AnsibleVaultEncryptedUnicode(list_1)
        ansible_unicode_0 = module_2.AnsibleUnicode()
        var_0 = ansible_dumper_0.represent_data(ansible_unicode_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = False
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        bytes_0 = b"\x0f;{/\xe6\xc1\xcb'q\xed\xd6?o"
        ansible_dumper_0 = module_0.AnsibleDumper(bool_0, list_0, bytes_0)
        float_0 = 333.51
        ansible_vault_encrypted_unicode_0 = module_2.AnsibleVaultEncryptedUnicode(float_0)
        dict_0 = {}
        host_vars_vars_0 = None
        ansible_mapping_0 = None
        tuple_0 = (dict_0, list_0, host_vars_vars_0, ansible_mapping_0)
        ansible_undefined_0 = module_1.AnsibleUndefined(list_0, tuple_0)
        async_iterator_0 = ansible_undefined_0.__aiter__()
        ansible_unsafe_bytes_0 = module_3.AnsibleUnsafeBytes()
        host_vars_0 = module_4.HostVars(async_iterator_0, ansible_unsafe_bytes_0, host_vars_vars_0)
        host_vars_1 = module_4.HostVars(bool_0, host_vars_0, float_0)
        var_0 = ansible_dumper_0.represent_data(host_vars_1)
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = False
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        bytes_0 = b'\xd0\xf8'
        ansible_dumper_0 = module_0.AnsibleDumper(bool_0, list_0, bytes_0)
        list_1 = [list_0]
        ansible_unsafe_bytes_0 = module_3.AnsibleUnsafeBytes(*list_1)
        var_0 = ansible_dumper_0.represent_data(ansible_unsafe_bytes_0)
        list_2 = [bytes_0, bool_0]
        ansible_vault_encrypted_unicode_0 = module_2.AnsibleVaultEncryptedUnicode(list_2)
        ansible_unicode_0 = module_2.AnsibleUnicode()
        var_1 = ansible_dumper_0.represent_data(ansible_unicode_0)
        var_2 = module_0.represent_vault_encrypted_unicode(bytes_0)
    except BaseException:
        pass