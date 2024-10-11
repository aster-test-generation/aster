import unittest
from ansible.modules.yum_repository import *


class TestYumRepositoryModule(unittest.TestCase):
    def test___init__(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        self.assertIsInstance(module, YumRepositoryModule)

    def test___str__(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        self.assertIsInstance(module.__str__(), str)

    def test___repr__(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        self.assertIsInstance(module.__repr__(), str)

    def test_run(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module.run()
        self.assertIsInstance(result, dict)

    def test_get_repo_file(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module._get_repo_file('epel')
        self.assertIsInstance(result, str)

    def test_create_repo_file(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module._create_repo_file('epel', 'EPEL YUM repo', 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/')
        self.assertIsInstance(result, str)

    def test_update_repo_file(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module._update_repo_file('epel', 'EPEL YUM repo', 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/')
        self.assertIsInstance(result, str)

    def test_delete_repo_file(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module._delete_repo_file('epel')
        self.assertIsInstance(result, str)

    def test_get_repo_config(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module._get_repo_config('epel')
        self.assertIsInstance(result, dict)

    def test_set_repo_config(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module._set_repo_config('epel', {'name': 'EPEL YUM repo', 'baseurl': 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/'})
        self.assertIsInstance(result, dict)

    def test_check_mode(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module.check_mode()
        self.assertIsInstance(result, bool)

    def test_diff_mode(self):
        from ansible.modules.packaging.os import YumRepositoryModule
        result = module.diff_mode()
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()