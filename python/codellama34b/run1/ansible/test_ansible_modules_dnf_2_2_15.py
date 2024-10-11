import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_get_best_version(self):
        instance = DnfModule(None)
        instance.get_best_version('test')

    def test_get_package_name(self):
        instance = DnfModule(None)
        instance.get_package_name('test')

    def test_get_package_version(self):
        instance = DnfModule(None)
        instance.get_package_version('test')

    def test_get_package_release(self):
        instance = DnfModule(None)
        instance.get_package_release('test')

    def test_get_package_arch(self):
        instance = DnfModule(None)
        instance.get_package_arch('test')

    def test_get_package_install_date(self):
        instance = DnfModule(None)
        instance.get_package_install_date('test')

    def test_get_package_sources(self):
        instance = DnfModule(None)
        instance.get_package_sources('test')

    def test_get_package_summary(self):
        instance = DnfModule(None)
        instance.get_package_summary('test')

    def test_get_package_url(self):
        instance = DnfModule(None)
        instance.get_package_url('test')

    def test_get_package_license(self):
        instance = DnfModule(None)
        instance.get_package_license('test')

    def test_get_package_vendor(self):
        instance = DnfModule(None)
        instance.get_package_vendor('test')

    def test_get_package_description(self):
        instance = DnfModule(None)
        instance.get_package_description('test')

    def test_get_package_buildtime(self):
        instance = DnfModule(None)
        instance.get_package_buildtime('test')

    def test_get_package_buildhost(self):
        instance = DnfModule(None)
        instance.get_package_buildhost('test')

    def test_get_package_installtime(self):
        instance = DnfModule(None)
        instance.get_package_installtime('test')

    def test_get_package_size(self):
        instance = DnfModule(None)
        instance.get_package_size('test')

    def test_get_package_md5(self):
        instance = DnfModule(None)
        instance.get_package_md5('test')

    def test_get_package_sha256(self):
        instance = DnfModule(None)
        instance.get_package_sha256('test')

    def test_get_package_signature(self):
        instance = DnfModule(None)
        instance.get_package_signature('test')

    def test_get_package_signature_status(self):
        instance = DnfModule(None)
        instance.get_package_signature_status('test')

    def test_get_package_signature_keyid(self):
        instance = DnfModule(None)
        instance.get_package_signature_keyid('test')

    def test_get_package_signature_result(self):
        instance = DnfModule(None)
        instance.get_package_signature_result('test')

    def test_get_package_type(self):
        instance = DnfModule(None)
        instance.get_package_type('test')

if __name__ == '__main__':
    unittest.main()