# Automatically generated by Pynguin.
import ansible.cli.doc as module_0

def test_case_0():
    try:
        set_0 = set()
        var_0 = module_0.jdump(set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        role_mixin_0 = module_0.RoleMixin()
        doc_c_l_i_0 = module_0.DocCLI(role_mixin_0)
        var_0 = doc_c_l_i_0.display_plugin_list(doc_c_l_i_0)
    except BaseException:
        pass

def test_case_2():
    try:
        plugin_not_found_0 = module_0.PluginNotFound()
        doc_c_l_i_0 = module_0.DocCLI(plugin_not_found_0)
        var_0 = doc_c_l_i_0.run()
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        str_0 = 'jiMybEio/&c'
        doc_c_l_i_0 = module_0.DocCLI(str_0)
        var_0 = doc_c_l_i_0.get_all_plugins_of_type(dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        set_0 = set()
        bytes_0 = b''
        role_mixin_0 = module_0.RoleMixin()
        doc_c_l_i_0 = module_0.DocCLI(role_mixin_0)
        var_0 = doc_c_l_i_0.get_plugin_metadata(set_0, bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'c'
        doc_c_l_i_0 = module_0.DocCLI(str_0)
        var_0 = doc_c_l_i_0.run()
        tuple_0 = None
        var_1 = module_0.jdump(tuple_0)
        str_1 = '6i\nyhr[.C ?x ]~'
        int_0 = 1575
        str_2 = '\\,0Sv[6'
        list_0 = [var_0, str_2, str_0]
        var_2 = doc_c_l_i_0.format_snippet(str_2, str_1, list_0)
        str_3 = '\x0b)5-of}?&'
        var_3 = doc_c_l_i_0.namespace_from_plugin_filepath(list_0, int_0, str_3)
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = False
        bytes_0 = b'\xcd\xd5\xcf\xc2\xf6Y\xaa\xb0\x0c\x95\x85Y\xef\xa31\xa1"\xbc'
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        dict_0 = {}
        list_1 = [dict_0]
        bool_1 = False
        bytes_1 = b''
        bytes_2 = b'Z\x9f(\x19\xb3\xa0k\xb4\x91\x15\x03M\x8b'
        str_0 = 'network_cli'
        dict_1 = {str_0: str_0}
        role_mixin_0 = None
        var_0 = module_0.jdump(role_mixin_0)
        list_2 = [bool_0, bytes_0, list_0]
        doc_c_l_i_0 = module_0.DocCLI(list_2)
        var_1 = doc_c_l_i_0.format_plugin_doc(dict_0, list_1, bool_1, bytes_1, bytes_2, dict_1)
    except BaseException:
        pass

def test_case_7():
    try:
        bytes_0 = b'?\x90\xf9\xe4mwVa\xe0\x04'
        tuple_0 = ()
        str_0 = '6i\nyhr[.C ?x ]~'
        dict_0 = {str_0: bytes_0}
        int_0 = 1575
        doc_c_l_i_0 = module_0.DocCLI(dict_0)
        var_0 = doc_c_l_i_0.add_fields(int_0, tuple_0, tuple_0, tuple_0)
        var_1 = doc_c_l_i_0.init_parser()
    except BaseException:
        pass

def test_case_8():
    try:
        float_0 = 3716.81
        role_mixin_0 = module_0.RoleMixin()
        str_0 = 'F7'
        str_1 = '?+9L_1#V'
        dict_0 = {str_0: role_mixin_0, str_1: float_0, str_1: str_0, str_1: role_mixin_0}
        list_0 = [str_0]
        plugin_not_found_0 = module_0.PluginNotFound(*list_0)
        doc_c_l_i_0 = module_0.DocCLI(plugin_not_found_0)
        doc_c_l_i_1 = module_0.DocCLI(doc_c_l_i_0)
        str_2 = '<W!K8Ac004]dy('
        doc_c_l_i_2 = module_0.DocCLI(str_2)
        var_0 = doc_c_l_i_2.get_role_man_text(dict_0, doc_c_l_i_1)
    except BaseException:
        pass

def test_case_9():
    try:
        list_0 = []
        bytes_0 = b'w'
        set_0 = {bytes_0}
        bool_0 = True
        doc_c_l_i_0 = module_0.DocCLI(bool_0)
        var_0 = doc_c_l_i_0.get_man_text(list_0, bytes_0, set_0)
    except BaseException:
        pass

def test_case_10():
    try:
        plugin_not_found_0 = module_0.PluginNotFound()
        dict_0 = {plugin_not_found_0: plugin_not_found_0, plugin_not_found_0: plugin_not_found_0, plugin_not_found_0: plugin_not_found_0}
        str_0 = 'sparcv9v'
        dict_1 = None
        dict_2 = {str_0: dict_1, dict_1: dict_1, dict_1: str_0, dict_1: str_0}
        doc_c_l_i_0 = module_0.DocCLI(dict_2)
        var_0 = doc_c_l_i_0.get_man_text(dict_0)
    except BaseException:
        pass

def test_case_11():
    try:
        plugin_not_found_0 = module_0.PluginNotFound()
        str_0 = '%\rL'
        str_1 = 'BEPVy[j>m"/t'
        doc_c_l_i_0 = module_0.DocCLI(str_1)
        var_0 = doc_c_l_i_0.format_snippet(plugin_not_found_0, str_0, plugin_not_found_0)
    except BaseException:
        pass

def test_case_12():
    try:
        bytes_0 = b'?\x90\xf9\xe4mwVa\xe0\x04'
        str_0 = '6i\nyhr[.C ?x ]~'
        dict_0 = {str_0: bytes_0}
        doc_c_l_i_0 = module_0.DocCLI(dict_0)
        bytes_1 = b'%;\xce%Z\xd2I'
        dict_1 = {doc_c_l_i_0: doc_c_l_i_0}
        var_0 = doc_c_l_i_0.format_snippet(bytes_1, dict_1, dict_1)
        var_1 = doc_c_l_i_0.init_parser()
    except BaseException:
        pass

def test_case_13():
    try:
        str_0 = '=d&bSb'
        str_1 = 'i]$ UJ3a(<!=TsLf'
        str_2 = None
        list_0 = [str_0, str_1]
        dict_0 = {str_0: str_2}
        int_0 = -1076
        set_0 = {str_1}
        doc_c_l_i_0 = module_0.DocCLI(set_0)
        float_0 = 334.887579
        doc_c_l_i_1 = module_0.DocCLI(float_0)
        var_0 = doc_c_l_i_1.add_fields(list_0, dict_0, int_0, doc_c_l_i_0)
    except BaseException:
        pass

def test_case_14():
    try:
        bool_0 = True
        var_0 = module_0.jdump(bool_0)
        str_0 = '\x0cg\\>'
        role_mixin_0 = module_0.RoleMixin()
        var_1 = module_0.jdump(str_0)
        list_0 = [bool_0, bool_0]
        bool_1 = True
        list_1 = []
        plugin_not_found_0 = module_0.PluginNotFound(*list_0)
        doc_c_l_i_0 = module_0.DocCLI(plugin_not_found_0)
        var_2 = doc_c_l_i_0.find_plugins(bool_1, list_1, list_0)
        dict_0 = {}
        role_mixin_1 = None
        list_2 = [bool_0, dict_0, role_mixin_1, var_1]
        bytes_0 = b'b<~\xf2]5\xe8\xa8G\xe0'
        tuple_0 = (bytes_0,)
        float_0 = 5072.987737
        role_mixin_2 = module_0.RoleMixin()
        doc_c_l_i_1 = module_0.DocCLI(role_mixin_2)
        var_3 = doc_c_l_i_1.namespace_from_plugin_filepath(list_2, tuple_0, float_0)
    except BaseException:
        pass

def test_case_15():
    try:
        str_0 = 'Qun'
        dict_0 = {}
        role_mixin_0 = module_0.RoleMixin(**dict_0)
        doc_c_l_i_0 = module_0.DocCLI(role_mixin_0)
        dict_1 = {str_0: doc_c_l_i_0, str_0: str_0, str_0: doc_c_l_i_0, str_0: doc_c_l_i_0, str_0: dict_0}
        str_1 = '\n---\nmodule: copy\nversion_added: historical\nshort_description: Copy files to remote locations\ndescription:\n    - The C(copy) module copies a file from the local or remote machine to a location on the remote machine.\n    - Use the M(ansible.builtin.fetch) module to copy files from remote locations to the local box.\n    - If you need variable interpolation in copied files, use the M(ansible.builtin.template) module.\n      Using a variable in the C(content) field will result in unpredictable output.\n    - For Windows targets, use the M(ansible.windows.win_copy) module instead.\noptions:\n  src:\n    description:\n    - Local path to a file to copy to the remote server.\n    - This can be absolute or relative.\n    - If path is a directory, it is copied recursively. In this case, if path ends\n      with "/", only inside contents of that directory are copied to destination.\n      Otherwise, if it does not end with "/", the directory itself with all contents\n      is copied. This behavior is similar to the C(rsync) command line tool.\n    type: path\n  content:\n    description:\n    - When used instead of C(src), sets the contents of a file directly to the specified value.\n    - Works only when C(dest) is a file. Creates the file if it does not exist.\n    - For advanced formatting or if C(content) contains a variable, use the\n      M(ansible.builtin.template) module.\n    type: str\n    version_added: \'1.1\'\n  dest:\n    description:\n    - Remote absolute path where the file should be copied to.\n    - If C(src) is a directory, this must be a directory too.\n    - If C(dest) is a non-existent path and if either C(dest) ends with "/" or C(src) is a directory, C(dest) is created.\n    - If I(dest) is a relative path, the starting directory is determined by the remote host.\n    - If C(src) and C(dest) are files, the parent directory of C(dest) is not created and the task fails if it does not already exist.\n    type: path\n    required: yes\n  backup:\n    description:\n    - Create a backup file including the timestamp information so you can get the original file back if you somehow clobbered it incorrectly.\n    type: bool\n    default: no\n    version_added: \'0.7\'\n  force:\n    description:\n    - Influence whether the remote file must always be replaced.\n    - If C(yes), the remote file will be replaced when contents are different than the source.\n    - If C(no), the file will only be transferred if the destination does not exist.\n    - Alias C(thirsty) has been deprecated and will be removed in 2.13.\n    type: bool\n    default: yes\n    aliases: [ thirsty ]\n    version_added: \'1.1\'\n  mode:\n    description:\n    - The permissions of the destination file or directory.\n    - For those used to C(/usr/bin/chmod) remember that modes are actually octal numbers.\n      You must either add a leading zero so that Ansible\'s YAML parser knows it is an octal number\n      (like C(0644) or C(01777)) or quote it (like C(\'644\') or C(\'1777\')) so Ansible receives a string\n      and can do its own conversion from string into number. Giving Ansible a number without following\n      one of these rules will end up with a decimal number which will have unexpected results.\n    - As of Ansible 1.8, the mode may be specified as a symbolic mode (for example, C(u+rwx) or C(u=rw,g=r,o=r)).\n    - As of Ansible 2.3, the mode may als be the special string C(preserve).\n    - C(preserve) means that the file will be given the same permissions as the source file.\n    - When doing a recursive copy, see also C(directory_mode).\n    - If C(mode) is not specified and the destination file B(does not) exist, the default C(umask) on the system will be used\n      when setting the mode for the newly created file.\n    - If C(mode) is not specified and the destination file B(does) exist, the mode of the existing file will be used.\n    - Specifying C(mode) is the best way to ensure files are created with the correct permissions.\n      See CVE-2020-1736 for further details.\n  directory_mode:\n    description:\n    - When doing a recursive copy set the mode for the directories.\n    - If this is not set we will use the system defaults.\n    - The mode is only set on directories which are newly created, and will not affect those that already existed.\n    type: raw\n    version_added: \'1.5\'\n  remote_src:\n    description:\n    - Influence whether C(src) needs to be transferred or already is present remotely.\n    - If C(no), it will search for C(src) on the controller node.\n    - If C(yes) it will search for C(src) on the managed (remote) node.\n    - C(remote_src) supports recursive copying as of version 2.8.\n    - C(remote_src) only works with C(mode=preserve) as of version 2.6.\n    - Autodecryption of files does not work when C(remote_src=yes).\n    type: bool\n    default: no\n    version_added: \'2.0\'\n  follow:\n    description:\n    - This flag indicates that filesystem links in the destination, if they exist, should be followed.\n    type: bool\n    default: no\n    version_added: \'1.8\'\n  local_follow:\n    description:\n    - This flag indicates that filesystem links in the source tree, if they exist, should be followed.\n    type: bool\n    default: yes\n    version_added: \'2.4\'\n  checksum:\n    description:\n    - SHA1 checksum of the file being transferred.\n    - Used to validate that the copy of the file was successful.\n    - If this is not provided, ansible will use the local calculated checksum of the src file.\n    type: str\n    version_added: \'2.5\'\nextends_documentation_fragment:\n    - decrypt\n    - files\n    - validate\n    - action_common_attributes\n    - action_common_attributes.files\n    - action_common_attributes.flow\nnotes:\n    - The M(ansible.builtin.copy) module recursively copy facility does not scale to lots (>hundreds) of files.\nseealso:\n    - module: ansible.builtin.assemble\n    - module: ansible.builtin.fetch\n    - module: ansible.builtin.file\n    - module: ansible.builtin.template\n    - module: ansible.posix.synchronize\n    - module: ansible.windows.win_copy\nauthor:\n    - Ansible Core Team\n    - Michael DeHaan\nattributes:\n  action:\n    support: full\n  async:\n    support: none\n  bypass_host_loop:\n    support: none\n  check_mode:\n    support: full\n  diff_mode:\n    support: full\n  platform:\n    platforms: posix\n  safe_file_operations:\n      support: full\n  vault:\n    support: full\n    version_added: \'2.2\'\n'
        doc_c_l_i_1 = module_0.DocCLI(str_1)
        var_0 = doc_c_l_i_1.format_snippet(doc_c_l_i_0, str_0, dict_1)
        doc_c_l_i_2 = module_0.DocCLI(str_0)
        var_1 = doc_c_l_i_2.run()
        float_0 = 0.0001
        var_2 = module_0.add_collection_plugins(float_0, doc_c_l_i_0)
        bytes_0 = b'\xb4\xd2\xb5'
        int_0 = 728
        list_0 = [bytes_0]
        var_3 = doc_c_l_i_2.find_plugins(bytes_0, str_0, int_0, list_0)
        var_4 = doc_c_l_i_2.run()
        bytes_1 = b"\x0b^qZ\x8e\xdd9'"
        var_5 = doc_c_l_i_2.format_snippet(bytes_0, bytes_1, str_1)
    except BaseException:
        pass