import unittest
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'test_repo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'test_repo.repo',
            'dest': '/etc/yum.repos.d/test_repo.repo'
        }
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, 'test_repo')
        self.assertEqual(self.yum_repo.params['dest'], '/etc/yum.repos.d/test_repo.repo')

    def test_read_repo_file(self):
        with patch('yum_repository.configparser.ConfigParser') as mock_configparser:
            mock_configparser.return_value.read.return_value = None
            self.yum_repo.read()
            mock_configparser.return_value.read.assert_called_once_with('/etc/yum.repos.d/test_repo.repo')

    def test_save_repo_file(self):
        with patch('yum_repository.configparser.ConfigParser') as mock_configparser:
            mock_configparser.return_value.sections.return_value = ['test_repo']
            self.yum_repo.save()
            mock_configparser.return_value.write.assert_called_once()

    def test_remove_repo_file(self):
        with patch('yum_repository.configparser.ConfigParser') as mock_configparser:
            mock_configparser.return_value.sections.return_value = []
            self.yum_repo.save()
            os.remove.assert_called_once_with('/etc/yum.repos.d/test_repo.repo')

if __name__ == '__main__':
    unittest.main()