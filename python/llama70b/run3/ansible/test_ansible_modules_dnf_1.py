import unittest
from ansible.modules.dnf import *


class TestDnfModule(unittest.TestCase):
    def test___init__(self):
        from ansible.modules.dnf import DnfModule
        self.assertIsInstance(instance, DnfModule)

    def test_run(self):
        from ansible.modules.dnf import DnfModule
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__dnf_base(self):
        from ansible.modules.dnf import DnfModule
        result = instance._dnf_base()
        self.assertIsInstance(result, YumDnf)

    def test__get_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_packages(['httpd'])
        self.assertIsInstance(result, list)

    def test__install_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance._install_packages(['httpd'])
        self.assertIsInstance(result, dict)

    def test__remove_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance._remove_packages(['httpd'])
        self.assertIsInstance(result, dict)

    def test__update_packages(self):
        from ansible.modules.dnf import DnfModule
        result = instance._update_packages(['httpd'])
        self.assertIsInstance(result, dict)

    def test__autoremove(self):
        from ansible.modules.dnf import DnfModule
        result = instance._autoremove()
        self.assertIsInstance(result, dict)

    def test__get_repoquery(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_repoquery()
        self.assertIsInstance(result, str)

    def test__get_download_dir(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_download_dir()
        self.assertIsInstance(result, str)

    def test__get_lock_timeout(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_lock_timeout()
        self.assertIsInstance(result, int)

    def test__get_allowerasing(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_allowerasing()
        self.assertIsInstance(result, bool)

    def test__get_nobest(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_nobest()
        self.assertIsInstance(result, bool)

    def test__get_cacheonly(self):
        from ansible.modules.dnf import DnfModule
        result = instance._get_cacheonly()
        self.assertIsInstance(result, bool)

    def test___str__(self):
        from ansible.modules.dnf import DnfModule
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.modules.dnf import DnfModule
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        from ansible.modules.dnf import DnfModule
        instance2 = DnfModule()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()