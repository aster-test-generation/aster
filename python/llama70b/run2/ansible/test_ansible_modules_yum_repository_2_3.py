import unittest
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        from ansible.module_utils.basic import AnsibleModule
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, 'test')
        self.assertEqual(self.yum_repo.params['dest'], '/etc/yum.repos.d/test.repo')

    def test_save(self):
        # Test saving a repo file with sections
        self.yum_repo.repofile = configparser.ConfigParser()
        self.yum_repo.repofile.add_section('test')
        self.yum_repo.repofile.set('test', 'baseurl', 'https://example.com')
        self.yum_repo.save()
        self.assertTrue(os.path.exists('/etc/yum.repos.d/test.repo'))

        # Test removing an empty repo file
        os.remove('/etc/yum.repos.d/test.repo')
        self.yum_repo.repofile = configparser.ConfigParser()
        self.yum_repo.save()
        self.assertFalse(os.path.exists('/etc/yum.repos.d/test.repo'))

    def test_private_methods(self):
        # Test __init__ private method
        self.yum_repo._YumRepo__init__(self.module)
        self.assertEqual(self.yum_repo.module, self.module)

        # Test _save private method
        self.yum_repo._YumRepo__save()
        self.assertTrue(os.path.exists('/etc/yum.repos.d/test.repo'))

    def test_protected_methods(self):
        # Test _read protected method
        self.yum_repo._read('/etc/yum.repos.d/test.repo')
        self.assertIsInstance(self.yum_repo.repofile, configparser.ConfigParser)

    def test_magic_methods(self):
        # Test __str__ magic method
        self.assertEqual(str(self.yum_repo), 'YumRepo(test)')

        # Test __repr__ magic method
        self.assertEqual(repr(self.yum_repo), 'YumRepo(test)')

        # Test __eq__ magic method
        self.assertEqual(self.yum_repo, YumRepo(self.module))

if __name__ == '__main__':
    unittest.main()