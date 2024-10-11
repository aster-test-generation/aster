import unittest
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'epel',
            'reposdir': '/etc/yum.repos.d',
            'file': 'external_repos',
            'baseurl': 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/',
            'gpgcheck': False
        }
        self.yum_repo = YumRepo(self.module)

    def test_remove_section(self):
        self.yum_repo.repofile.has_section.return_value = True
        self.yum_repo.remove()
        self.yum_repo.repofile.remove_section.assert_called_with('epel')

    def test_remove_section_not_exists(self):
        self.yum_repo.repofile.has_section.return_value = False
        self.yum_repo.remove()
        self.yum_repo.repofile.remove_section.assert_not_called()

if __name__ == '__main__':
    unittest.main()