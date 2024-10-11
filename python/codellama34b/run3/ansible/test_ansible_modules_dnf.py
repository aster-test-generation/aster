import unittest
from ansible.modules.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.base)
        self.assertIsNone(instance.conf)
        self.assertIsNone(instance.module)
        self.assertIsNone(instance.pkg_mgr_name)
        self.assertIsNone(instance.rpmdb)
        self.assertIsNone(instance.transaction)
        self.assertIsNone(instance.yumbase)
        self.assertIsNone(instance.yumtransaction)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.ensure_dnf())

    def test_get_best_version(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_best_version())

    def test_get_package_name(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_name())

    def test_get_package_version(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_version())

    def test_get_package_name_and_version(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_name_and_version())

    def test_get_package_arch(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_arch())

    def test_get_package_release(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_release())

    def test_get_package_type(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_type())

    def test_get_package_repo(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_repo())

    def test_get_package_summary(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_summary())

    def test_get_package_url(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_url())

    def test_get_package_license(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_license())

    def test_get_package_vendor(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_vendor())

    def test_get_package_description(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_description())

    def test_get_package_buildtime(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_buildtime())

    def test_get_package_installtime(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_installtime())

    def test_get_package_sourcerpm(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_sourcerpm())

    def test_get_package_files(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_files())

    def test_get_package_changelog(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_changelog())

    def test_get_package_obsoletes(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_package_obsoletes())

if __name__ == '__main__':
    unittest.main()