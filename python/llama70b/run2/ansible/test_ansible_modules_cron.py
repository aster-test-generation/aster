import unittest
from ansible.modules.cron import main, CronTab, AnsibleModule


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        self.assertIsInstance(crontab, CronTab)

    def test_add_env(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_env'
        job = 'test_job'
        decl = '%s="%s"' % (name, job)
        crontab.add_env(decl, None, None)
        self.assertTrue(crontab.find_env(name))

    def test_update_env(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_env'
        job = 'test_job'
        decl = '%s="%s"' % (name, job)
        crontab.add_env(decl, None, None)
        new_job = 'new_test_job'
        new_decl = '%s="%s"' % (name, new_job)
        crontab.update_env(name, new_decl)
        self.assertEqual(crontab.find_env(name)[1], new_decl)

    def test_remove_env(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_env'
        job = 'test_job'
        decl = '%s="%s"' % (name, job)
        crontab.add_env(decl, None, None)
        crontab.remove_env(name)
        self.assertFalse(crontab.find_env(name))

    def test_add_job(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_job'
        job = 'test_command'
        crontab.add_job(name, job)
        self.assertTrue(crontab.find_job(name))

    def test_update_job(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_job'
        job = 'test_command'
        crontab.add_job(name, job)
        new_job = 'new_test_command'
        crontab.update_job(name, new_job)
        self.assertEqual(crontab.find_job(name)[1], new_job)

    def test_remove_job(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_job'
        job = 'test_command'
        crontab.add_job(name, job)
        crontab.remove_job(name)
        self.assertFalse(crontab.find_job(name))

    def test_get_jobnames(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_job'
        job = 'test_command'
        crontab.add_job(name, job)
        self.assertIn(name, crontab.get_jobnames())

    def test_get_envnames(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_env'
        job = 'test_job'
        decl = '%s="%s"' % (name, job)
        crontab.add_env(decl, None, None)
        self.assertIn(name, crontab.get_envnames())

    def test_write(self):
        module = AnsibleModule()
        user = 'test_user'
        cron_file = 'test_cron_file'
        crontab = CronTab(module, user, cron_file)
        name = 'test_job'
        job = 'test_command'
        crontab.add_job(name, job)
        crontab.write()
        self.assertTrue(os.path.isfile(crontab.cron_file))

class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule()
        self.assertIsInstance(module, AnsibleModule)

if __name__ == '__main__':
    unittest.main()