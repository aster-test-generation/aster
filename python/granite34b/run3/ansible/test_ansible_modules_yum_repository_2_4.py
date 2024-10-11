import unittest
import yum_repository


class TestYumRepo(unittest.TestCase):
    def test_remove_section(self):
        module = MagicMock()
        module.params = {
            'repoid': 'epel',
            'reposdir': '/etc/yum.repos.d',
            'file': 'external_repos'
        }
        yum_repo = YumRepo(module)
        yum_repo.repofile.read(module.params['dest'])
        yum_repo.remove()
        self.assertFalse(yum_repo.repofile.has_section(yum_repo.section))

if __name__ == '__main__':
    unittest.main()