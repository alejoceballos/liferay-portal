/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 */

import ClayLoadingIndicator from '@clayui/loading-indicator';
import classNames from 'classnames';
import {useEffect} from 'react';
import i18n from '../../../../common/I18n';
import ProjectCard from './components/ProjectCard';
import useIntersectionObserver from './hooks/useIntersectionObserver';

const ProjectList = ({
	fetching,
	hasManyProjects,
	koroneikiAccounts,
	loading,
	onIntersect,
}) => {
	const [setTrackedRefCurrent, isIntersecting] = useIntersectionObserver();

	const showFetching =
		koroneikiAccounts?.page !== koroneikiAccounts?.lastPage && !fetching;

	useEffect(() => {
		if (isIntersecting) {
			onIntersect(koroneikiAccounts?.page);
		}
	}, [isIntersecting, koroneikiAccounts?.page, onIntersect]);

	const getProjects = () => {
		return koroneikiAccounts?.items.map((koroneikiAccount, index) => (
			<ProjectCard
				compressed={hasManyProjects}
				key={`${koroneikiAccount.accountKey}-${index}`}
				{...koroneikiAccount}
			/>
		));
	};

	if (loading) {
		return <>Loading</>;
	}

	return (
		<div
			className={classNames('d-flex flex-wrap', {
				'cp-home-projects px-5': !hasManyProjects,
				'cp-home-projects-sm pt-2': hasManyProjects,
			})}
		>
			{koroneikiAccounts?.totalCount ? (
				<>
					{getProjects()}
					{showFetching && (
						<div className="mx-auto" ref={setTrackedRefCurrent}>
							<ClayLoadingIndicator small />
						</div>
					)}
				</>
			) : (
				<p className="mx-auto">
					{i18n.translate('no-projects-match-these-criteria')}
				</p>
			)}
		</div>
	);
};

export default ProjectList;
