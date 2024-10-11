import unittest
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def test_mark_package_install(self):
        module = YumDnf(AnsibleModule({}))
        dnf_module = DnfModule(module)
        pkg_spec = 'example_package'
        result = dnf_module._mark_package_install(pkg_spec)
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

if __name__ == '__main__':
    unittest.main()