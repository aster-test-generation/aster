from ansible.modules.pip import _is_package_name

import unittest
from ansible.modules.pip import *

class TestPipModule(unittest.TestCase):
    def test_is_package_name(self):
        result = _is_package_name("name")
        self.assertTrue(result)

    def test_is_package_name_with_version(self):
        result = _is_package_name("name==1.0.0")
        self.assertTrue(result)

    def test_is_package_name_with_version_specifiers(self):
        result = _is_package_name("name>1.0.0,<2.0.0")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git==1.0.0")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git>1.0.0,<2.0.0")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers_and_at(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git@>1.0.0,<2.0.0")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers_and_at_and_hash(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git@>1.0.0,<2.0.0#egg=ansible")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers_and_at_and_hash_and_extra_args(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git@>1.0.0,<2.0.0#egg=ansible --extra-args")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers_and_at_and_hash_and_extra_args_and_editable(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git@>1.0.0,<2.0.0#egg=ansible --extra-args --editable")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers_and_at_and_hash_and_extra_args_and_editable_and_chdir(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git@>1.0.0,<2.0.0#egg=ansible --extra-args --editable --chdir")
        self.assertTrue(result)

    def test_is_package_name_with_vcs_plus_and_version_specifiers_and_at_and_hash_and_extra_args_and_editable_and_chdir_and_executable(self):
        result = _is_package_name("git+https://github.com/ansible/ansible.git@>1.0.0,<2.0.0#egg=ansible --extra-args --editable --chdir --executable")
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()