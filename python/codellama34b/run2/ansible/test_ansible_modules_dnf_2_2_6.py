import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertEqual(instance.lockfile, "/var/cache/dnf/*_lock.pid")
        self.assertEqual(instance.pkg_mgr_name, "dnf")
        self.assertEqual(instance.allowerasing, None)
        self.assertEqual(instance.nobest, None)

if __name__ == '__main__':
    unittest.main()