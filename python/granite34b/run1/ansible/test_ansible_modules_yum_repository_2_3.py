import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native
from ansible.modules.yum_repository import YumRepo


class TestYumRepository(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=YumRepo.argument_spec,
            supports_check_mode=True
        )
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, self.module.params['repoid'])
        repos_dir = self.module.params['reposdir']
        self.assertEqual(self.yum_repo.params['dest'], os.path.join(repos_dir, '%s.repo' % self.module.params['file']))
        if os.path.isfile(self.yum_repo.params['dest']):
            self.yum_repo.repofile.read(self.yum_repo.params['dest'])

    def test_save(self):
        if len(self.yum_repo.repofile.sections()):
            try:
                with open(self.yum_repo.params['dest'], 'w') as fd:
                    self.yum_repo.repofile.write(fd)
            except IOError as e:
                self.module.fail_json(msg='Problems handling file %s.' % self.yum_repo.params['dest'], details=to_native(e))
        else:
            try:
                os.remove(self.yum_repo.params['dest'])
            except OSError as e:
                self.module.fail_json(msg='Cannot remove empty repo file %s.' % self.yum_repo.params['dest'], details=to_native(e))

if __name__ == '__main__':
    unittest.main()