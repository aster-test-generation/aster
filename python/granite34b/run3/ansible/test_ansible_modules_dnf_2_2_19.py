import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=yumdnf_argument_spec
            supports_check_mode=True,
        )
        self.dnf = DnfModule(self.module)

    def test_install_remote_rpms(self):
        filenames = ['file1.rpm', 'file2.rpm']
        self.dnf._install_remote_rpms(filenames)
        self.assertEqual(self.dnf.base.transaction.install_set, set(filenames))

    def test_install_local_rpms(self):
        filenames = ['file1.rpm', 'file2.rpm']
        self.dnf._install_local_rpms(filenames)
        self.assertEqual(self.dnf.base.transaction.install_set, set(filenames))

    def test_remove_packages(self):
        packages = ['package1', 'package2']
        self.dnf._remove_packages(packages)
        self.assertEqual(self.dnf.base.transaction.remove_set, set(packages))

    def test_update_packages(self):
        packages = ['package1', 'package2']
        self.dnf._update_packages(packages)
        self.assertEqual(self.dnf.base.transaction.upgrade_set, set(packages))

    def test_upgrade_system(self):
        self.dnf._upgrade_system()
        self.assertEqual(self.dnf.base.transaction.upgrade_set, set(self.dnf.base.rpmdb))

    def test_autoremove_packages(self):
        self.dnf._autoremove_packages()
        self.assertEqual(self.dnf.base.transaction.remove_set, set(self.dnf.base.rpmdb))

    def test_download_packages(self):
        packages = ['package1', 'package2']
        self.dnf._download_packages(packages)
        self.assertEqual(self.dnf.base.transaction.install_set, set(packages))

    def test_download_rpms(self):
        filenames = ['file1.rpm', 'file2.rpm']
        self.dnf._download_rpms(filenames)
        self.assertEqual(self.dnf.base.transaction.install_set, set(filenames))

    def test_download_package(self):
        package = 'package1'
        self.dnf._download_package(package)
        self.assertEqual(self.dnf.base.transaction.install_set, set([package]))

    def test_download_rpm(self):
        filename = 'file1.rpm'
        self.dnf._download_rpm(filename)
        self.assertEqual(self.dnf.base.transaction.install_set, set([filename]))

    def test_download_rpms_from_url(self):
        urls = ['http://example.com/file1.rpm', 'http://example.com/file2.rpm']
        self.dnf._download_rpms_from_url(urls)
        self.assertEqual(self.dnf.base.transaction.install_set, set(urls))

    def test_download_rpms_from_local_path(self):
        paths = ['/path/to/file1.rpm', '/path/to/file2.rpm']
        self.dnf._download_rpms_from_local_path(paths)
        self.assertEqual(self.dnf.base.transaction.install_set, set(paths))

    def test_download_rpms_from_file(self):
        files = ['file1.rpm', 'file2.rpm']
        self.dnf._download_rpms_from_file(files)
        self.assertEqual(self.dnf.base.transaction.install_set, set(files))

    def test_download_rpms_from_content(self):
        contents = ['content1', 'content2']
        self.dnf._download_rpms_from_content(contents)
        self.assertEqual(self.dnf.base.transaction.install_set, set(contents))

if __name__ == '__main__':
    unittest.main()