import unittest
from ansible.modules.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule()
        self.assertIsInstance(instance, DnfModule)

    def test_run(self):
        instance = DnfModule()
        result = instance.run()
        self.assertIsNotNone(result)

    def test_ensure(self):
        instance = DnfModule()
        result = instance.ensure()
        self.assertIsNotNone(result)

    def test_list_items(self):
        instance = DnfModule()
        result = instance.list_items()
        self.assertIsNotNone(result)

    def test_base(self):
        instance = DnfModule(None, None, None, None)
        result = instance._base()
        self.assertIsNotNone(result)

    def test_ensure_dnf(self):
        instance = DnfModule()
        result = instance._ensure_dnf()
        self.assertIsNotNone(result)

    def test_list_items(self):
        instance = DnfModule()
        result = instance.list_items()
        self.assertIsNotNone(result)

    def test_get_packages(self):
        instance = DnfModule()
        result = instance._get_packages()
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec(self):
        instance = DnfModule()
        result = instance._get_packages(yumdnf_argument_spec)
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec_and_module(self):
        instance = DnfModule(None, None, None, None)
        result = instance._get_packages(yumdnf_argument_spec, self.module)
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec_and_module_and_conf_file(self):
        instance = DnfModule()
        result = instance._get_packages(yumdnf_argument_spec, self.module, self.conf_file)
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec_and_module_and_conf_file_and_disable_gpg_check(self):
        instance = DnfModule()
        result = instance._get_packages(yumdnf_argument_spec, self.module, self.conf_file, self.disable_gpg_check)
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec_and_module_and_conf_file_and_disable_gpg_check_and_disablerepo(self):
        instance = DnfModule()
        result = instance._get_packages(yumdnf_argument_spec, self.module, self.conf_file, self.disable_gpg_check, self.disablerepo)
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec_and_module_and_conf_file_and_disable_gpg_check_and_disablerepo_and_enablerepo(self):
        instance = DnfModule()
        result = instance._get_packages(yumdnf_argument_spec, self.module, self.conf_file, self.disable_gpg_check, self.disablerepo, self.enablerepo)
        self.assertIsNotNone(result)

    def test_get_packages_with_argument_spec_and_module_and_conf_file_and_disable_gpg_check_and_disablerepo_and_enablerepo_and_installroot(self):
        instance = DnfModule()
        result = instance._get_packages(yumdnf_argument_spec, self.module, self.conf_file, self.disable_gpg_check, self.disablerepo, self.enablerepo, self.installroot)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()