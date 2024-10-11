import os
import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.six.moves import configparser
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                repoid=dict(type='str', required=True),
                reposdir=dict(type='path', default='/etc/yum.repos.d'),
                file=dict(type='str', default=None),
                dest=dict(type='path', default=None),
                # Add other parameters here
            ),
            supports_check_mode=True
        )
        self.params = self.module.params
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.params)
        self.assertEqual(self.yum_repo.section, self.params['repoid'])
        repos_dir = self.params['reposdir']
        self.assertTrue(os.path.isdir(repos_dir))
        self.assertEqual(self.yum_repo.params['dest'], os.path.join(repos_dir, '%s.repo' % self.params['file']))
        if os.path.isfile(self.params['dest']):
            self.yum_repo.repofile.read(self.params['dest'])

    def test_save(self):
        if len(self.yum_repo.repofile.sections()):
            try:
                with open(self.params['dest'], 'w') as fd:
                    self.yum_repo.repofile.write(fd)
            except IOError as e:
                self.module.fail_json(msg='Problems handling file %s.' % self.params['dest'], details=to_native(e))
        else:
            try:
                os.remove(self.params['dest'])
            except OSError as e:
                self.module.fail_json(msg='Cannot remove empty repo file %s.' % self.params['dest'], details=to_native(e))

if __name__ == '__main__':
    unittest.main()