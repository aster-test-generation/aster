import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_ensure_dnf(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        self.assertTrue(dnf.dnf)

    def test_package_dict(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        package = MagicMock()
        package.name = 'test_package'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1'
        package.version = '1.0'
        package.repoid = 'test_repo'
        package.installtime = 0
        result = dnf._package_dict(package)
        self.assertEqual(result['name'], package.name)
        self.assertEqual(result['arch'], package.arch)
        self.assertEqual(result['epoch'], str(package.epoch))
        self.assertEqual(result['release'], package.release)
        self.assertEqual(result['version'], package.version)
        self.assertEqual(result['repo'], package.repoid)
        self.assertEqual(result['envra'], '{epoch}:{name}-{version}-{release}.{arch}'.format(epoch=str(package.epoch), name=package.name, version=package.version, release=package.release, arch=package.arch))
        self.assertEqual(result['nevra'], result['envra'])
        self.assertEqual(result['yumstate'], 'available')

if __name__ == '__main__':
    unittest.main()