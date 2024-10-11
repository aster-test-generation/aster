import unittest
from ansible.modules.dnf import *


class TestDnfModule(unittest.TestCase):
    def test___init__(self):
        from ansible.modules.dnf import DnfModule
        self.assertIsInstance(instance, DnfModule)

    def test___str__(self):
        from ansible.modules.dnf import DnfModule
        result = str(instance)
        self.assertEqual(result, "dnf")

    def test___repr__(self):
        from ansible.modules.dnf import DnfModule
        result = repr(instance)
        self.assertEqual(result, "DnfModule()")

    def test_run(self):
        from ansible.modules.dnf import DnfModule
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_main(self):
        from ansible.modules.dnf import DnfModule
        result = instance.main()
        self.assertIsInstance(result, dict)

    def test_get_package_info(self):
        from ansible.modules.dnf import DnfModule
        result = instance.get_package_info("httpd")
        self.assertIsInstance(result, dict)

    def test_install_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance.install_packages(["httpd"])
        self.assertIsInstance(result, dict)

    def test_remove_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance.remove_packages(["httpd"])
        self.assertIsInstance(result, dict)

    def test_update_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance.update_packages(["httpd"])
        self.assertIsInstance(result, dict)

    def test_list_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance.list_packages()
        self.assertIsInstance(result, list)

    def test__parse_package_name(self):
        from ansible.modules.dnf import DnfModule
        result = instance._parse_package_name("httpd")
        self.assertEqual(result, "httpd")

    def test__get_package_version(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_package_version("httpd")
        self.assertIsInstance(result, str)

    def test__get_package_arch(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_package_arch("httpd")
        self.assertIsInstance(result, str)

    def test__get_package_repo(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_package_repo("httpd")
        self.assertIsInstance(result, str)

    def test__get_package_state(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_package_state("httpd")
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()