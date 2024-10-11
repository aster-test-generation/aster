import unittest
from ansible.modules.dnf import DnfModule

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