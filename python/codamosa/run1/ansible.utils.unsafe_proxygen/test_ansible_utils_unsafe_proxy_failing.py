# Automatically generated by Pynguin.
import ansible.utils.unsafe_proxy as module_0

def test_case_0():
    try:
        str_0 = 'TE([pn'
        dict_0 = {str_0: str_0}
        ansible_unsafe_text_0 = module_0.AnsibleUnsafeText()
        var_0 = ansible_unsafe_text_0.encode(**dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'aGhAiHniE0?SPv( '
        var_0 = module_0.wrap_var(str_0)
        native_jinja_unsafe_text_0 = module_0.NativeJinjaUnsafeText()
        bytes_0 = b'\x1a\xd8\x1e\xbdU\xac\x1b\xa7G\xd4\xabv\xd6\x92\x93\xe9\x08bB\x8b'
        list_0 = []
        list_1 = [str_0]
        unsafe_proxy_0 = module_0.UnsafeProxy(*list_1)
        var_1 = unsafe_proxy_0.__new__(native_jinja_unsafe_text_0, bytes_0, *list_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'KBa:r(\r'
        dict_0 = {str_0: str_0}
        ansible_unsafe_bytes_0 = module_0.AnsibleUnsafeBytes()
        var_0 = module_0.wrap_var(ansible_unsafe_bytes_0)
        ansible_unsafe_0 = module_0.AnsibleUnsafe()
        ansible_unsafe_1 = module_0.AnsibleUnsafe(**dict_0)
    except BaseException:
        pass

def test_case_3():
    try:
        var_0 = module_0.to_unsafe_bytes()
    except BaseException:
        pass

def test_case_4():
    try:
        native_jinja_unsafe_text_0 = module_0.NativeJinjaUnsafeText()
        var_0 = module_0.to_unsafe_text()
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = None
        ansible_unsafe_0 = module_0.AnsibleUnsafe()
        list_0 = [dict_0]
        unsafe_proxy_0 = module_0.UnsafeProxy(*list_0)
        ansible_unsafe_bytes_0 = module_0.AnsibleUnsafeBytes(*list_0, **dict_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = '`ci,"Qf?%dgN\n'
        ansible_unsafe_bytes_0 = module_0.AnsibleUnsafeBytes()
        var_0 = ansible_unsafe_bytes_0.decode()
        ansible_unsafe_0 = module_0.AnsibleUnsafe()
        ansible_unsafe_bytes_1 = module_0.AnsibleUnsafeBytes()
        dict_0 = {str_0: str_0}
        native_jinja_unsafe_text_0 = module_0.NativeJinjaUnsafeText(**dict_0)
    except BaseException:
        pass

def test_case_7():
    try:
        bytes_0 = b'\x06\x97eB\x98'
        var_0 = module_0.wrap_var(bytes_0)
        list_0 = [var_0]
        unsafe_proxy_0 = module_0.UnsafeProxy(*list_0)
        str_0 = "xom<.k'oOK~W.*!StSa"
        str_1 = ''
        list_1 = [str_0]
        unsafe_proxy_1 = module_0.UnsafeProxy(*list_1)
        dict_0 = {str_0: str_1}
        ansible_unsafe_bytes_0 = module_0.AnsibleUnsafeBytes(**dict_0)
    except BaseException:
        pass