import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestYumDnf(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        self.assertIsInstance(yumdnf, YumDnf)

    def test_get_available_packages(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        packages = yumdnf.get_available_packages()
        self.assertIsInstance(packages, list)

    def test_get_installed_packages(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        packages = yumdnf.get_installed_packages()
        self.assertIsInstance(packages, list)

    def test_get_updates(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        updates = yumdnf.get_updates()
        self.assertIsInstance(updates, list)

    def test_install(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        result = yumdnf.install()
        self.assertIsInstance(result, dict)

    def test_remove(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        result = yumdnf.remove()
        self.assertIsInstance(result, dict)

    def test_update(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        result = yumdnf.update()
        self.assertIsInstance(result, dict)

    def test_has_package(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        result = yumdnf.has_package()
        self.assertIsInstance(result, bool)

    def test_has_updates(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        result = yumdnf.has_updates()
        self.assertIsInstance(result, bool)

    def test_parse_dnf_output(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        output = yumdnf.parse_dnf_output()
        self.assertIsInstance(output, dict)

    def test_get_package_info(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        info = yumdnf.get_package_info()
        self.assertIsInstance(info, dict)

    def test_get_transaction_info(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True
        )
        yumdnf = YumDnf(module)
        info = yumdnf.get_transaction_info()
        self.assertIsInstance(info, dict)

if __name__ == '__main__':
    unittest.main()