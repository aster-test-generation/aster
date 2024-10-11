import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_to_native(self):
        result = to_native('test')
        self.assertEqual(result, 'test')

    def test_to_text(self):
        result = to_text('test')
        self.assertEqual(result, 'test')

    def test_fetch_file(self):
        result = fetch_file(url='http://example.com/file.txt')
        self.assertEqual(result, 'file content')

    def test_PY2(self):
        self.assertTrue(True)

    def test_text_type(self):
        result = text_type('test')
        self.assertEqual(result, 'test')

    def test_LooseVersion(self):
        version = LooseVersion('1.0')
        self.assertEqual(version.version, (1, 0))

    def test_AnsibleModule(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(module, AnsibleModule)

    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale(module=None)
        self.assertEqual(result, 'en_US.UTF-8')

    def test_has_respawned(self):
        result = has_respawned()
        self.assertFalse(result)

    def test_probe_interpreters_for_module(self):
        result = probe_interpreters_for_module('python', module_name='sys')
        self.assertEqual(result, ['/usr/bin/python'])

    def test_respawn_module(self):
        result = respawn_module(sys.executable)
        self.assertEqual(result, 0)

    def test_YumDnf(self):
        module = AnsibleModule(argument_spec=dict(
        yumdnf = YumDnf(module)
        self.assertIsInstance(yumdnf, YumDnf)


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = None
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(dnf_module.with_modules)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_whatprovides(self):
        dnf_module = DnfModule(None)
        filepath = '/usr/bin/cowsay'
        self.assertEqual(dnf_module._whatprovides(filepath), 'cowsay')

if __name__ == '__main__':
    unittest.main()