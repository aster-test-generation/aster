import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_base(self):
        instance = DnfModule(None)
        result = instance._base(None, None, None, None, None)
        self.assertEqual(result, None)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        result = instance._ensure_dnf()
        self.assertEqual(result, None)

    def test_configure_base(self):
        instance = DnfModule(None)
        result = instance._configure_base(None, None, None, None)
        self.assertEqual(result, None)

    def test_specify_repositories(self):
        instance = DnfModule(None)
        result = instance._specify_repositories(None, None, None)
        self.assertEqual(result, None)

    def test_set_check_update(self):
        instance = DnfModule(None)
        result = instance._set_check_update(None)
        self.assertEqual(result, None)

    def test_set_install_weak_deps(self):
        instance = DnfModule(None)
        result = instance._set_install_weak_deps(None)
        self.assertEqual(result, None)

    def test_set_releasever(self):
        instance = DnfModule(None)
        result = instance._set_releasever(None)
        self.assertEqual(result, None)

    def test_set_installroot(self):
        instance = DnfModule(None)
        result = instance._set_installroot(None)
        self.assertEqual(result, None)

    def test_set_disable_excludes(self):
        instance = DnfModule(None)
        result = instance._set_disable_excludes(None)
        self.assertEqual(result, None)

    def test_set_tsflags(self):
        instance = DnfModule(None)
        result = instance._set_tsflags(None)
        self.assertEqual(result, None)

    def test_set_security_options(self):
        instance = DnfModule(None)
        result = instance._set_security_options(None)
        self.assertEqual(result, None)

    def test_set_module_options(self):
        instance = DnfModule(None)
        result = instance._set_module_options(None)
        self.assertEqual(result, None)

    def test_set_debuglevel(self):
        instance = DnfModule(None)
        result = instance._set_debuglevel(None)
        self.assertEqual(result, None)

    def test_set_enable_plugin(self):
        instance = DnfModule(None)
        result = instance._set_enable_plugin(None)
        self.assertEqual(result, None)

    def test_set_disable_plugin(self):
        instance = DnfModule(None)
        result = instance._set_disable_plugin(None)
        self.assertEqual(result, None)

    def test_set_download_options(self):
        instance = DnfModule(None)
        result = instance._set_download_options(None)
        self.assertEqual(result, None)

    def test_set_download_dir(self):
        instance = DnfModule(None)
        result = instance._set_download_dir(None)
        self.assertEqual(result, None)

    def test_set_cacheonly(self):
        instance = DnfModule(None)
        result = instance._set_cacheonly(None)
        self.assertEqual(result, None)

    def test_set_best(self):
        instance = DnfModule(None)
        result = instance._set_best(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()